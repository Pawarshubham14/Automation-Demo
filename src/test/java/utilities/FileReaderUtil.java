package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtil {

	Properties prop;

	public FileReaderUtil() throws IOException {

		FileInputStream file = new FileInputStream("src/test/resources/credentials.txt");

		prop = new Properties();
		prop.load(file);

	}
	public String getUsername() {
		return prop.getProperty("name");
	}
	public String getlastname() {
		return prop.getProperty("last_name");
	}
	public String getEmail() {
		return prop.getProperty("email");
	}
	public String getPassword() {
		return prop.getProperty("password");
	}
	public String getadress() {
		return prop.getProperty("Adress");
	}
	public String getadress1() {
		return prop.getProperty("Adress1");
	}
	public String getstate() {
		return prop.getProperty("state");
	}
	public String getcity() {
		return prop.getProperty("city");
	}
	public String getpin() {
		return prop.getProperty("pin");
	}
	public String getmobilenumber() {
		return prop.getProperty("mb");
	}
	public String getcompany() {
		return prop.getProperty("company");
	}

}
