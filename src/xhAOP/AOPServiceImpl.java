package xhAOP;


public class AOPServiceImpl implements IAOPService {

	private String name;
	@Override
	public void withAOP() {
		System.out.println("with aop start: name is:"+name);
		// TODO Auto-generated method stub

	}

	@Override
	public void withoutAOP() {
		System.out.println("without aop start: name is:"+name);
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
