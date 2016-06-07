package xhAOP;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testService1();
		testService2();

	}

	/**
	 * 
	 */
	private static void testService1() {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			IAOPService service=(IAOPService)context.getBean("aopservice1");
			service.withAOP();
			service.withoutAOP();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testService2() {
		try {
			ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
			IAOPService service=(IAOPService)context.getBean("aopservice2");
			service.withAOP();
			service.withoutAOP();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
