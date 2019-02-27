package beans;

import java.beans.PropertyVetoException;
import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFromComboPoolDs {

	public static void main(String[] args) throws Exception {
		ComboPooledDataSource cp=new ComboPooledDataSource();
		cp.setDriverClass("oracle.jdbc.OracleDriver");
		cp.setJdbcUrl("jdbc:oracle:thin:192.168.0.103:1521:orcl");
		cp.setUser("naveen");
		cp.setPassword("naveen");
		cp.setMaxPoolSize(15);
		cp.setMaxIdleTime(1);
		cp.setMinPoolSize(5);
		
		for (int i = 0; i < 25; i++) {
			try {
				
				Connection con =cp.getConnection();
				System.out.println(con+"   :"+i);
				con.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
