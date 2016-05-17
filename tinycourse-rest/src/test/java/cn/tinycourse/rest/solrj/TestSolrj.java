package cn.tinycourse.rest.solrj;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class TestSolrj {

	private static final String IP_ADDR = "http://10.10.28.91:8080/solr";
	
	@Test
	public void addDocument() throws Exception{
		//创建一个连接
		SolrServer solrServer = new HttpSolrServer(IP_ADDR);
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", "test01");
		document.addField("fuxiao_test", "使用solrj客户端");
		//把文档对象写入数据库
		solrServer.add(document);
		//提交
		solrServer.commit();
	}
	
	@Test
	public void deleteDocument() throws Exception{
		//创建一个连接
		SolrServer solrServer = new HttpSolrServer(IP_ADDR);
		//根据id删除
		//solrServer.deleteById("test01");
		solrServer.deleteByQuery("*:*");
		//提交
		solrServer.commit();
	}
	
}
