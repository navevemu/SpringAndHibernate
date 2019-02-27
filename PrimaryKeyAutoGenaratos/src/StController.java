

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class StController
 */

public class StController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	   SessionFactory sf;
	    @Override
	    public void init(ServletConfig config) throws ServletException {
	    	Configuration c=new Configuration();
	    	c.configure("resoucres/student.cf.xml");
	    	sf=c.buildSessionFactory();
	    	System.out.println("Session factory object craeted");
	    	
	    }
  
    public StController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String email=req.getParameter("email");
		int marks=Integer.parseInt(req.getParameter("marks"));
		String address=req.getParameter("address");
		String grade=req.getParameter("grade");
		Student st=new Student(0,name,grade,email,marks,address);
		Session s=sf.openSession();
		int pk=(int)s.save(st);
		Transaction t=s.beginTransaction();
		t.commit();
		
	}
@Override
public void destroy() {
	sf.close();
	//s.close();
}


}
