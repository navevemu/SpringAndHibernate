package daoimpl;



import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;


import dao.StudentDao;
import model.Student;

public class StudentDaoImpl implements StudentDao {
	
     private HibernateTemplate ht;
     public StudentDaoImpl() {
		// TODO Auto-generated constructor stub
	}
     public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public int save(Student s) throws Exception {
		//ht.save(s);
		
		
	return	(Integer) ht.save(s);
		
		
	}

	public int update(Student s) throws Exception {
		ht.update(s);
		return 1;
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
	
return ht.get(Student.class, s);
		
	}

	public List<Student> findbyName(Student s) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		
		return (List<Student>) ht.find("from Student");
	}

}
