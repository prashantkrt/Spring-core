package om.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.util.Password;

public class LaunchApp {
	
	public static void main(String[] args) {
		
		//eager loading
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
//		Password p =context.getBean(Password.class);
//		p.display();
		((ClassPathXmlApplicationContext)context).close();
	}

}
