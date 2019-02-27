package studentAppUsingSpringJdbc.Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jd;




	public JdbcTemplate getJd() {
	return jd;
}

public void setJd(JdbcTemplate jd) {
	this.jd = jd;
}

	@Override
	public int save(StudentModel st) throws Exception {
		Object o[]=new Object[]{st.getStudentid(),st.getStname(),st.getMobileno(),st.getAddress()};
		int i=jd.update("insert into student2 values(?,?,?,?)", o);
		
		
		return i;
	}

	@Override
	public List<String> findById(int id) throws Exception {
		List<String> l;
		l=jd.queryForList("select sname from student2 ",String.class);
	
				return l;
	}

	

}
