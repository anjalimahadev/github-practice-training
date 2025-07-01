package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Anjali
 */
public class FileUtility {
	/**
	 * This method is used to read data from property file by taking key from caller
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commonData.properties");
		Properties prep=new Properties();
		prep.load(fis);
		return prep.getProperty(key);
	}
}
