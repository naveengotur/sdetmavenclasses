package day41_DatadrivernTestingwithMSExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadProperties {

	public static void main(String[]args) throws Exception{

		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properites");

		//create object of properties class
		Properties propertiesObj= new Properties();

		//loading the properites file
		propertiesObj.load(file);

		//Reading data from properties file
		 String url = propertiesObj.getProperty("appurl");
		 String email = propertiesObj.getProperty("email");
		 String pwd = propertiesObj.getProperty("password");
		 String ordid = propertiesObj.getProperty("orderid");
		String custid = propertiesObj.getProperty("customerid");

		System.out.println(url+" "+email+" "+pwd+" "+ordid+" "+custid);

		//Reading all keys from properties file


		Set<String> keys= propertiesObj.stringPropertyNames();

		System.out.println(keys); //password, orderid, customerid, appurl, email]

		/*or
		Set<Object> keys = propertiesObj.keySet();
		System.out.println(keys);//password, orderid, customerid, appurl, email]
		*/

		//Reading all the values from properties file
		Collection<Object> values = propertiesObj.values();
		System.out.println(values);

		file.close();
		}

}
