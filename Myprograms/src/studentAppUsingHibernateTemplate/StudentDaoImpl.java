package studentAppUsingHibernateTemplate;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDaoImpl implements StudentDao {
private DataSource ds1;

	public DataSource getDs1() {
	return ds1;
}

public void setDs1(DataSource ds1) {
	this.ds1 = ds1;
}

	@Override
	public int save(StudentModel st) throws Exception {
		Connection con =ds1.getConnection();
		PreparedStatement p=con.prepareStatement("insert into Student2 values(?,?,?,?)");
		p.setInt(1,st.getStudentid());
		p.setString(2, st.getStname());
		p.setLong(3, st.getMobileno());
		p.setString(4, st.getAddress());
		p.execute();
		return 0;
	}

	@Override
	public List<StudentModel> findById(int id) throws Exception {
		Connection con=ds1.getConnection();
		PreparedStatement p=con.prepareStatement("select * from student2 where sid=?");
		p.setInt(1, id);
		ResultSet rs=p.executeQuery();
		List<StudentModel> l=new ArrayList();
		while(rs.next())
		{
			/*System.out.println("StudentId="+rs.getInt(1)+"  StudentName="+rs.getString(2)+"  mobileNo="
					+rs.getLong(3)+"   Student Address="+rs.getString(4));
			*/
			StudentModel sm=new StudentModel();
			sm.setStudentid(rs.getInt(1));
			sm.setStname(rs.getString(2));
			sm.setMobileno(rs.getLong(3));
			sm.setAddress(rs.getString(4));
			l.add(sm);
		}
		
		return l;
	}

	

}
