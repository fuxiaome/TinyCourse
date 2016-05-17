package cn.tinycourse.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tinycourse.mapper.UserMapper;
import cn.tinycourse.pojo.User;
import cn.tinycourse.pojo.UserExample;

/**
 * Description:测试MyBatis分页插件
 * @author fuxiao
 * Date:2016年4月26日
 * Time:下午4:44:52
 */
public class TestPageHelper {

	public  void testPageHelper(){
		//创建一个Spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
		//从 Spring容器中获得Mapper的代理对象
		UserMapper userMapper = context.getBean(UserMapper.class);
		//执行查询并分页
		UserExample example = new UserExample();
		//分页处理,第一个参数表示要显示第几页，第二个参数表示每页显示的记录数
		PageHelper.startPage(1,4);
		List<User> list = userMapper.selectByExample(example);
		//取用户列表
		for(User user: list){
			System.out.println(user.getUserDate());
		}
		//取分页信息
		PageInfo<User> pageInfo = new PageInfo<>(list);
		System.out.println("查询的记录总数"+pageInfo.getTotal());
		System.out.println("页面数"+pageInfo.getPageSize());
		
	}
}
