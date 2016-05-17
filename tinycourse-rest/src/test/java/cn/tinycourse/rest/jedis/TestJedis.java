package cn.tinycourse.rest.jedis;

import java.util.HashSet;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class TestJedis {
	
	@Test
	public void testJedisCluster(){
		HashSet<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("10.10.22.93", 7001));
		nodes.add(new HostAndPort("10.10.22.93", 7002));
		nodes.add(new HostAndPort("10.10.22.93", 7003));
		nodes.add(new HostAndPort("10.10.22.93", 7004));
		nodes.add(new HostAndPort("10.10.22.93", 7005));
		nodes.add(new HostAndPort("10.10.22.93", 7006));
		
		JedisCluster cluster = new JedisCluster(nodes);
		cluster.set("key2", "value2");
		String str = cluster.get("key2");
		System.out.println(str);
		cluster.close();
	}
	
	@Test
	public void testSpringJedisSingle(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-redis.xml");
		JedisPool pool = (JedisPool) context.getBean("redisPool");
		Jedis redis = pool.getResource();
		String str = redis.get("key1");
		System.out.println(str);
		redis.close();
	}

	@Test
	public void testJedisSingle(){
		//创建一个jedis的实例
		Jedis jedis = new Jedis("10.10.22.93", 6379);
		//调用jedis对象的方法
		jedis.set("key1", "value1");
		String str = jedis.get("key1");
		System.out.println(str);
		//关闭jedis
		jedis.close();
	}
	
	@Test
	public void testJedisConnPoll(){
		//创建jedis连接池对象
		JedisPool pool = new JedisPool("10.10.22.93", 6379);
		//从池中获得对象
		Jedis jedis = pool.getResource();
		String str = jedis.get("key1");
		System.out.println(str);
		//将连接对象放回池中
		jedis.close();
		pool.close();
	}
}
