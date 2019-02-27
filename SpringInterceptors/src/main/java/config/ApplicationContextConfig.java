package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("*")
public class ApplicationContextConfig  {
	
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		
		 InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		 
		 viewResolver.setPrefix("/WEB-INF/pages/");
		 viewResolver.setSuffix(".jsp");
		 return viewResolver;
	}
	
	

}
