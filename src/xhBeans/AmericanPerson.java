/**
 * 
 */
package xhBeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Administrator
 *
 */
public class AmericanPerson implements IPerson,BeanNameAware,BeanFactoryAware {
	private String name;
	private int age;
	private String beanName;
	private BeanFactory bFactory;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/* (non-Javadoc)
	 * @see xhBeans.IPerson#speak()
	 */
	@Override
	public void speak() {
		System.out.println("I am American,my name is:"+this.name+"and I'm "+this.age);
		System.out.println("It's bean name:"+this.beanName);
		System.out.println("It's beanFactory name:"+this.bFactory);
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName=arg0;
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.bFactory=arg0;
	}

}
