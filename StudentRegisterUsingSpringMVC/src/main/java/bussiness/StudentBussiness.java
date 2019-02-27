package bussiness;

import java.sql.SQLException;
import java.util.List;

import daoimpl.StudnetDao;
import model.Student;



public class StudentBussiness 
{
	private StudnetDao sd=new StudnetDao();
	public void setSd(StudnetDao sd) {
		this.sd = sd;
	}
	
	public StudnetDao getSd() {
		return sd;
	}

	public StudentBussiness() {
		
	}

	
	public List<Student> searchByName(String name)
	{
		try {
			return sd.search(name);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}


}

