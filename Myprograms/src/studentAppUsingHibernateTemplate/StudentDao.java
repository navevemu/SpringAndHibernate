package studentAppUsingHibernateTemplate;

import java.util.List;

public interface StudentDao {
public int save(StudentModel st) throws Exception;
public List<StudentModel> findById(int id) throws Exception;
}
