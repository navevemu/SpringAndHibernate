package bussiness;

import java.util.List;

import dao.StudnetDao;
import entities.Student;

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

	public int register(Student s){
		return sd.save(s);
		
		  
	}
	public List<Student> searchByName(String name)
	{
		return sd.search(name);
	}


}

