package controller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	
	@Override
	public void setAsText(String sname) throws IllegalArgumentException {
		if(sname.contains("Mr.")||sname.contains("Mrs."))
		{
			setValue(sname);
		}
		else
		{
			sname="Mr."+sname;
			setValue(sname);
		}
	
	}

}
