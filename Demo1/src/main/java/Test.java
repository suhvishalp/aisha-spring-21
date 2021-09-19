import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bo.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Employee emp1 = context.getBean(Employee.class);
		System.out.println("emp1 name = " + emp1.getName());
	
		Employee emp2 = context.getBean(Employee.class);
		System.out.println("emp2 name = " + emp2.getName());
	
		
		context.close();
	}

}
