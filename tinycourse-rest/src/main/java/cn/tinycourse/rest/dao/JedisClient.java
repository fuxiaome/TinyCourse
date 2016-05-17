package cn.tinycourse.rest.dao;

/**
 * Description:封装Jedis一些常用的方法
 * @author fuxiao
 * Date:2016年5月7日
 * Time:上午11:39:36
 */
public interface JedisClient {

	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String hkey, String key, String value);
	//对指定的key自增
	long incr(String key);
	//对指定的key自减
	long decr(String key);
	//设置指定key的生存时间，单位为秒
	long expire(String key, int seconds);
	//查看指定key的剩余存活时间,-1表示永久存活
	long ttl(String key);
	long del(String key);
	long hdel(String hkey, String key);
}
