package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEg {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("D:/svn/PracticePrograms/src/resources/db.properties");
		
		p.load(fi);
		System.out.println(p.getProperty("user"));
		p.setProperty("connection", "oracle");
		FileOutputStream fo=new FileOutputStream("D:/svn/PracticePrograms/src/resources/db.properties");
		p.store(fo, "updated by Naveen Royal");
		

	}

}
