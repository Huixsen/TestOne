/**
 * 
 */
package xhBeans;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class TestPerson {
	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IPerson chinese=(IPerson)context.getBean("CH");
		chinese.speak();
		IPerson american=(IPerson)context.getBean("USA");
		american.speak();
		String[] a={"×xÕß","ÇàÄê"};
		Object[] b={new Date()};
		String hello=context.getMessage("hello",a , Locale.getDefault());
		String now=context.getMessage("cTime",b , Locale.getDefault());
		
		System.out.println(hello);
		System.out.println(now);
		
		String hello2=context.getMessage("hello",a , Locale.US);
		String now2=context.getMessage("cTime",b , Locale.US);
		System.out.println(hello2);
		System.out.println(now2);
		
	}

}
