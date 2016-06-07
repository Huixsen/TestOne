/**
 * 
 */
package xhBeans;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Administrator
 *
 */
public class ChinesePerson implements IPerson,BeanNameAware {
	private String name;
	private int age;
	private String beanName;
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


	@Override
	public void speak() {
		System.out.println("I am chinese,my name is:"+this.name+"and I'm "+this.age);
		System.out.println("It's bean name:"+this.beanName);
		
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName=arg0;
	}

}
