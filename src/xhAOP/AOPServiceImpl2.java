/**
 * 
 */
package xhAOP;

/**
 * @author Administrator
 *
 */
public class AOPServiceImpl2 implements IAOPService {

	private String name;
	/* (non-Javadoc)
	 * @see xhAOP.IAOPService#withAOP()
	 */
	@Override
	public void withAOP() {
		// TODO Auto-generated method stub
		System.out.println("Service2 with aop start: name is:"+name);
		innerMethod();

	}

	/* (non-Javadoc)
	 * @see xhAOP.IAOPService#withoutAOP()
	 */
	@Override
	public void withoutAOP() {
		// TODO Auto-generated method stub
		System.out.println("Service2 without aop start: name is:"+name);

	}
	
	private void innerMethod()
	  {
		  System.out.println("service Inner method invoke");
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
