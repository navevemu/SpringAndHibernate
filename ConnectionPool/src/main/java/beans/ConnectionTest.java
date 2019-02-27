package beans;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionTest {

	public static void main(String[] args) {
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:192.168.0.103:1521:orcl");
		bds.setUsername("naveen");
		bds.setPassword("naveen");
		bds.setMaxActive(15);
		bds.setMaxIdle(5);
		bds.setMaxWait(5000);
		
		for (int i = 0; i < 25; i++) {
			try {
				
				Connection con =bds.getConnection();
				System.out.println(con+"   :"+i);
				//con.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
