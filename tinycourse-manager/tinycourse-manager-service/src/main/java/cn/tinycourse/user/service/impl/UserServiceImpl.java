package cn.tinycourse.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tinycourse.common.pojo.CommonResult;
import cn.tinycourse.common.pojo.EUDataGridResult;
import cn.tinycourse.mapper.ProfessionMapper;
import cn.tinycourse.mapper.UserMapper;
import cn.tinycourse.pojo.Profession;
import cn.tinycourse.pojo.ProfessionExample;
import cn.tinycourse.pojo.User;
import cn.tinycourse.pojo.UserExample;
import cn.tinycourse.pojo.UserExample.Criteria;
import cn.tinycourse.user.service.UserService;

/**
 * Description:UserService接口的实现类
 * @author fuxiao
 * Date:2016年4月26日
 * Time:下午6:03:06
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private ProfessionMapper proMapper;
	
	@Value("${FTP_ADDRESS}")
	private String FTP_ADDRESS;
	
	/**
	 * @param page 当前要显示第几页
	 * @param rows 要显示页码上的记录集合
	 * @return 将List<User>封装起来的POJO，转换为json供DataGrid组件使用
	 * MyBatis逆向工程
	 */
	@Override
	public EUDataGridResult getUserList(int page, int rows) {
		
		//不传参数则会查询到所有的记录
		UserExample example = new UserExample(); 
		Criteria criteria = example.createCriteria();
		criteria.andUserSexEqualTo("男");
		criteria.andProIdEqualTo(1);
		//调用PageHelper进行分页处理
		PageHelper.startPage(page, rows);
		List<User> userList = userMapper.selectByExample(example);
		//创建返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(userList);
		//取到记录总条数
		PageInfo<User> pageInfo = new PageInfo<>(userList);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public List<Profession> getProList() {
		//查询所有的专业
		ProfessionExample example = new ProfessionExample();
		List<Profession> proList =  proMapper.selectByExample(example);
		return proList;
	}

	@Override
	public CommonResult addNewUser(User user) {
		userMapper.insert(user);
		//添加用户ID,由于用户Id为自增字段故设为-1即可
		user.setUserId(100);
		//将用户图像上传至图片服务器
		return CommonResult.ok();
	}

}
