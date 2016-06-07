/**
 * 
 */
package xhBeans;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class TestCaseForPerson {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link xhBeans.ChinesePerson#speak()}.
	 */
	@Test
	public void testSpeak() {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IPerson chinese=(IPerson)context.getBean("CH");
		chinese.speak();
		//fail("Not yet implemented");
	}

}
