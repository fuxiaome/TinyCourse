package cn.tinycourse.rest.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import cn.tinycourse.rest.dao.JedisClient;
import redis.clients.jedis.JedisCluster;

/**
 * Description:JedisClient的集群版实现
 * @author fuxiao
 * Date:2016年5月7日
 * Time:下午12:00:35
 */
public class JedisClientCluster implements JedisClient{

	@Autowired
	private JedisCluster jedisCluster; 
	
	@Override
	public String get(String key) {
		String str = jedisCluster.get(key);
		//集群版使用完后无需进行关闭操作
		return str;
	}

	@Override
	public String set(String key, String value) {
		return jedisCluster.set(key, value);
	}

	@Override
	public String hget(String hkey, String key) {
		return jedisCluster.hget(hkey, key);
	}

	@Override
	public long hset(String hkey, String key, String value) {
		return jedisCluster.hset(hkey, key, value);
	}

	@Override
	public long incr(String key) {
		return jedisCluster.incr(key);
	}

	@Override
	public long decr(String key) {
		return jedisCluster.decr(key);
	}

	@Override
	public long expire(String key, int seconds) {
		return jedisCluster.expire(key, seconds);
	}

	@Override
	public long ttl(String key) {
		return jedisCluster.ttl(key);
	}

	@Override
	public long del(String key) {
		return jedisCluster.del(key);
	}

	@Override
	public long hdel(String hkey, String key) {
		 return jedisCluster.hdel(hkey, key);
	}

}
