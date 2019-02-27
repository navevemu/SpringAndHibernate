package dao;

import java.util.List;

import model.Student;

public interface StudentDao {
	
	public int save(Student s) throws Exception;
	public int update(Student s) throws Exception;
	public Student findbyPk(int s) throws Exception;
	public List<Student> findbyName(Student s) throws Exception;
	public List<Student> findAll() throws Exception;
	
	

}
