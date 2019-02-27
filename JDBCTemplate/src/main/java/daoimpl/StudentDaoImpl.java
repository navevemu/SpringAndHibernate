package daoimpl;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import dao.StudentDao;
import model.Student;

public class StudentDaoImpl implements StudentDao {
     private JdbcTemplate jd;
     public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	public int save(Student s) throws Exception {
		Object[] o=new Object[]{s.getId(),s.getName(),s.getGrade(),s.getEmail(),s.getMarks(),s.getAddress()};
		int i=jd.update("insert into student values(?,?,?,?,?,?)", o);
		
		
	return	i;
		
		
	}

	public int update(Student s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student findbyPk(int s) throws Exception {
//		Connection con =ds.getConnection();
//		PreparedStatement ps=con.prepareStatement("select * from student where sid=?");
//		ps.setInt(1, s);
//		ResultSet rs=ps.executeQuery();
//		rs.next();
//		Student student=new Student();
//		student.setId(rs.getInt(1));
//		student.setName(rs.getString(2));
//		student.setGrade(rs.getString(3));
//		student.setEmail(rs.getString(4));
//		student.setMarks(rs.getInt(5));
//		student.setAddress(rs.getString(6));
return null;
		
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
