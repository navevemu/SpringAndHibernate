package validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator  implements ConstraintValidator<IsValidHobby, String>{
	
	private String hobbies;
	
	public void initialize(IsValidHobby constraintAnnotation) {
	this.hobbies=constraintAnnotation.listOfHobbies();
	}

	public  boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		if(studentHobby==null){
			return false;
			
		}
		if(studentHobby.matches(hobbies))
				
				{ return true;}
		
		
		else		
		return false;
	}

}
