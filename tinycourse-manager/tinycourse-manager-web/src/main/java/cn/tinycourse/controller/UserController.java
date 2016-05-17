package cn.tinycourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tinycourse.common.pojo.CommonResult;
import cn.tinycourse.common.pojo.EUDataGridResult;
import cn.tinycourse.pojo.Profession;
import cn.tinycourse.pojo.User;
import cn.tinycourse.user.service.UserService;

/**
 * Description:用户Controller
 * @author fuxiao
 * Date:2016年4月26日
 * Time:下午6:24:17
 */

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	@ResponseBody
	public EUDataGridResult getUserList(){
		Integer page = 1;
		Integer rows  = 10;
		EUDataGridResult result = userService.getUserList(page, rows);
		return result;
	}
	
	@RequestMapping("getProList")
	@ResponseBody
	public List<Profession> getProList(){
		
		return userService.getProList();
	}
	
	@RequestMapping("addUser")
	@ResponseBody
	public CommonResult addNewUser(UserAdd user){
		System.out.println(user);
		System.out.println(user.getUserImage().getOriginalFilename());
		System.out.println(user.getUserImage().getSize());
		
		return CommonResult.ok();
	}
	
}
