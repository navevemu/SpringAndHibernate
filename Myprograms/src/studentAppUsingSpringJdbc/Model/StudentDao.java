package studentAppUsingSpringJdbc.Model;

import java.util.List;

//import student.StudentModel;

public interface StudentDao {
	public int save(StudentModel st) throws Exception;
	public List<String> findById(int id) throws Exception;

}
