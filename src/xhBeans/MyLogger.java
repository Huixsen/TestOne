package xhBeans;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyLogger implements MethodInterceptor {

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		before();
		//arg3.invoke(arg0, arg2);
		return null;
	}
	
	private void before()
	{
		System.out.println("before method, we can do something");
	}

}
