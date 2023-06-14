
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("bean.xml");
		Records record = (Records)context.getBean("record");
		System.out.println(record.getEmployee());
}
}

