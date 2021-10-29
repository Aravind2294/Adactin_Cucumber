package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\jegan\\eclipse-workspace\\Adactin_Hotel\\src\\main\\java\\com\\Config\\Properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	// Retrieve the URL
	public String getURL() throws Throwable {
		String url = p.getProperty("url");
		return url;
	}

	// Retrieve the user name
	public String getusername() throws Throwable {
		String username = p.getProperty("username");
		return username;

	}

	// Retrieve the password
	public String getpassword() throws Throwable {
		String password = p.getProperty("password");
		return password;
	}

}
