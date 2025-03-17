package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertiesFile(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream("./ConfigAppData/Commandata.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);   //key means key value in property file
		
		return data;
	}

}
