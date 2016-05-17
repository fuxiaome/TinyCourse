package cn.tinycourse.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.tinycourse.common.utils.JsonUtils;
import cn.tinycourse.service.PictureService;

/**
 * Description:上传图片处理
 * @author fuxiao
 * Date:2016年4月27日
 * Time:下午9:28:55
 */
public class PictureController {

	@Autowired
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String pictureUpload(MultipartFile uploadFile){
		Map result = pictureService.uploadPicture(uploadFile);
		//为了该上传功能在各浏览器的兼容性，需要把result装换成Json格式的字符串
		String json = JsonUtils.objectToJson(result);
		return json;
	}
}
