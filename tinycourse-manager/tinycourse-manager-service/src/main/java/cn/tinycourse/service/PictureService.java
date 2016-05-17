package cn.tinycourse.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

/**
 * Description:图片上传服务
 * @author fuxiao
 * Date:2016年4月27日
 * Time:下午8:28:33
 */
public interface PictureService {

	Map uploadPicture(MultipartFile uploadFile);
}
