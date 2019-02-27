package daoimpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import dao.StudentDao;
import model.Student;

public class StudentDaoImpl implements StudentDao {
     private DataSource ds;
     public void setDs(DataSource ds) {
		this.ds = ds;
	}
	public int save(Student s) throws Exception {
		Connection con =ds.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		ps.setInt(1,105);
		ps.setString(2, "pooja");
		ps.setString(3,"A");
		ps.setString(4, "poojavemuri@gmail.com");
		ps.setInt(5, 78);
		ps.setString(6, "Nellore");
	return	ps.executeUpdate();
		
		
	}

	public int update(Student s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student findbyPk(int s) throws Exception {
		Connection con =ds.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from student where sid=?");
		ps.setInt(1, s);
		ResultSet rs=ps.executeQuery();
		rs.next();
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setGrade(rs.getString(3));
		student.setEmail(rs.getString(4));
		student.setMarks(rs.getInt(5));
		student.setAddress(rs.getString(6));
		return student;
		
	}

	public List<Student> findbyName(Student s) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
