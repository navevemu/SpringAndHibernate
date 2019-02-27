package bussiness;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

interface  StudentDao extends InitializingBean,DisposableBean {

	public void save() ;
	
}
