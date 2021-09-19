import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.demo")
public class MyConfiguration {

	//	@Bean
	//	public Employee createEmployee() {
	//		//logic to construct employee object 
	//		Employee emp = new Employee();
	//		emp.setId(1);
	//		emp.setName("vishal");
	//		return emp;
	//	}
	//	
	//	@Bean
	//	public EmployeeService createEmpService() {
	//		return new EmployeeService();
	//	}
}
