package com.casestudy.util;

import java.sql.Connection;

public class DBConnection {
    static Connection connection = null;

	public static Connection getConnection()
	{
		String propstr=DBPropertyUtil.getConnectionString("C:\\Users\\HP\\Desktop\\Javascript\\Ecom---Case-Study-main\\casestudy\\src\\main\\java\\com\\casestudy\\util\\db.properties");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
