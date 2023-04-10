package PropertiesFileDemo;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	Properties properties;

	// Below path is config.properties file path.
	//String path = "E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\src\\test\\java\\PropertiesFileDemo\\Config.properties";
	String path = "E:\\OneDrive\\Desktop\\DemoTest\\Eclipse Workspace\\DemoTestMavenProject\\Test1\\src\\test\\java\\PropertiesFileDemo\\ConfigText.txt";

	public ReadConfigFile() {
		try {
			
			properties = new Properties();

			FileInputStream fis = new FileInputStream(path);
			properties.load(fis);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getBaseUrl() {
		String value = properties.getProperty("baseUrl");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");
	}

	public String getUsername() {
		String value = properties.getProperty("username");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("username not specified in config file.");
	}

	public String getPassword() {
		String value = properties.getProperty("password");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("password not specified in config file.");
	}
}
