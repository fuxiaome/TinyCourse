package cn.tinycourse.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import cn.tinycourse.common.utils.FtpUtil;
import cn.tinycourse.common.utils.IDUtils;
import cn.tinycourse.service.PictureService;

/**
 * Description:图片上传服务实现类
 * @author fuxiao
 * Date:2016年4月27日
 * Time:下午8:28:13
 */
public class PictureServiceImpl implements PictureService{

	/*只要将.properties格式的文件交由Spring管理，便可以通过下面的方式读取该key对应的值*/
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	@Value("${FTP_PORT}")
	private int FTP_PORT;
	@Value("${FTP_USERNAME}")
	private String FTP_USERNAME;
	@Value("${FTP_PASSWORD}")
	private String FTP_PASSWORD;
	@Value("${FTP_BASE_PATH}")
	private String FTP_BASE_PATH;
	@Value("${IMAGE_BASE_URL}")
	private String IMAGE_BASE_URL;
	
	/**
	 * 上传图片的实现
	 */
	@Override
	public Map uploadPicture(MultipartFile uploadFile) {
		Map resultMap = new HashMap<>();
		//取原始文件名
		String oldName = uploadFile.getOriginalFilename();
		//调用ID的工具类中图片名称方法生成新文件名
		//UUID.randomUUID();
		//生成新的文件名
		String newName = IDUtils.genImageName();
		newName = newName + oldName.substring(oldName.lastIndexOf("."));
		//使用FTPUtil上传文件
		//获取图片的二进制流
		InputStream inputStream = null;
		try {
			inputStream = uploadFile.getInputStream();
		} catch (IOException e) {
			//对于系统中的异常应该使用统一的方式进行处理，这里采用先打印错误信息，然后将该异常包装成
			//一个运行时异常进行抛出
			System.err.println("获取上传图片的IO流出错！");
			throw new RuntimeException(e);
		}
		//每次按时间生成文件夹，然后将图片放置到该文件夹下
		String imagePath = new DateTime().toString("/yyyy/MM/dd");
		boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH,
				imagePath, newName, inputStream);
		//返回上传图片的结果
		if(!result){
			resultMap.put("error", 1);
			resultMap.put("message", "文件上传失败！");
		}else{
			resultMap.put("error", 0);
			//成功时返回图片的路径，图片服务器的路径+图片在服务器上的存储路径
			resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
		}
		return resultMap;
	}

}
