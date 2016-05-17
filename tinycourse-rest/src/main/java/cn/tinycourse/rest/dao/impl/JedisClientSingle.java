package cn.tinycourse.rest.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.tinycourse.rest.dao.JedisClient;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Description:JedisClient接口的单机版实现
 * 在Spring配置文件进行该实现类Bean的配置 
 * @author fuxiao
 * Date:2016年5月7日
 * Time:上午11:46:50
 */
public class JedisClientSingle implements JedisClient {

	@Autowired
	private JedisPool jedisPool;
	
	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.get(key);
		//不能忘记关闭连接
		jedis.close();
		return string;
	}

	@Override
	public String set(String key, String value) {
		Jedis jedis = jedisPool.getResource();
		String str = jedis.set(key, value);
		jedis.close();
		return str;
	}

	@Override
	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String string = jedis.hget(hkey, key);
		jedis.close();
		return string;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long res = jedis.hset(hkey, key, value);
		jedis.close();
		return res;
	}

	@Override
	public long incr(String key) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.incr(key);
		jedis.close();
		return res;
	}

	@Override
	public long decr(String key) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.decr(key);
		jedis.close();
		return res;
	}

	@Override
	public long expire(String key, int seconds) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.expire(key, seconds);
		jedis.close();
		return res;
	}

	@Override
	public long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.ttl(key);
		jedis.close();
		return res;
	}

	@Override
	public long del(String key) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.del(key);
		//不能忘记关闭连接
		jedis.close();
		return res;
	}

	@Override
	public long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		long res = jedis.hdel(hkey, key);
		//不能忘记关闭连接
		jedis.close();
		return res;
	}

}
