package com.wuwang.ebookshare.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {

	private static String address="jdbc:oracle:thin:@//49.235.252.43:1521/PDBORCL";
	private static String dataBaseName="qiuj";
	private static String dataBasePwd="123";
	
	public static Connection getConn() {
		Connection conn=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection(address,dataBaseName,dataBasePwd);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("");
			}
		return conn;
	}
}
