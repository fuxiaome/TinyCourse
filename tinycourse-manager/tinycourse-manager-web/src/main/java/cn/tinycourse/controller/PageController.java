package cn.tinycourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:页面跳转Controller
 * 		WEB-INF目录默认无法直接访问，通过配置控制器进行页面跳转
 * @author fuxiao
 * Date:2016年4月25日
 */
@Controller
public class PageController {
	
	static private final String INDEX = "index";
	/**
	 * 展示其他页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex(){
		return INDEX;
	}
	
}
