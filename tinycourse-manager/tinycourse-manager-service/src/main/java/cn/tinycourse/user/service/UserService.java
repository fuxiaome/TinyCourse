package cn.tinycourse.user.service;

import java.util.List;

import cn.tinycourse.common.pojo.CommonResult;
import cn.tinycourse.common.pojo.EUDataGridResult;
import cn.tinycourse.pojo.Profession;
import cn.tinycourse.pojo.User;

/**
 * Description:用户相关操作的Service接口
 * @author fuxiao
 * Date:2016年4月26日
 * Time:下午5:58:28
 */
public interface UserService {

	/**
	 * @param page 当前要显示第几页
	 * @param rows 要显示页码上的记录集合
	 * @return 将List<User>封装起来的POJO，转换为json供DataGrid组件使用
	 */
	public EUDataGridResult getUserList(int page, int rows);
	/**
	 * 返回专业列表,形如下面
	 * 	[ {proName : '软件工程', proId : '1'}]
	 * @return 将List转换为json格式数据
	 */
	public List<Profession> getProList();
	
	/**
	 * 向数据库中添加新的用户
	 * @return 项目中通用的结果类型
	 */
	public CommonResult addNewUser(User newUser);
	
	
}
