package sun;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Util {

	public static Connection getCon() {
		Connection con = null;
		try {

			InputStream in = Util.class.getClassLoader().getResourceAsStream("jdbc.properties");
			Properties p = new Properties();
			p.load(in);
			System.out.println(p.getProperty("Driver"));
			System.out.println(p.getProperty("url"));
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));

			Class.forName(p.getProperty("Driver"));

			con = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("password"));
			System.out.println("connection success............");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}