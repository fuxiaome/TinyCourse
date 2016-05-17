package cn.tinycourse.controller;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {
	
	private static final String IP_ADDR = "172.27.251.38";

	@Test
	public void testFtpClient() throws SocketException, IOException{
		//创建FTPClient对象，common.net包下
		FTPClient ftpClient = new FTPClient();
		//创建FTP连接
		ftpClient.connect(IP_ADDR, 21);
		//登录FTP服务器，使用用户名和密码
		ftpClient.login("fuxiao", "pass");
		//上传文件,默认为文档类型，若上传二进制文件需要更改文件流类型
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//设置上传的路径
		ftpClient.changeWorkingDirectory("/home/fuxiao/www/images");
		//第一个参数表示：服务器端的文件名
		//第二个参数表示: 要上传文件的IO流
		//读取本地文件
		FileInputStream local = new FileInputStream("C:/Users/Fu_Xiao/Pictures/a.jpg");
		ftpClient.storeFile("testFtp.jpg", local);
		//关闭连接
		ftpClient.logout();
		local.close();
	}
	
	@Test
	public void testTwo(){
		System.out.println("sfsa");
	}
	
}
