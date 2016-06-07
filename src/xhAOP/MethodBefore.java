package xhAOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MethodBefore implements MethodBeforeAdvice {
	
  public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable
  {
	  System.out.println("before method start, the method is:"+arg0.getName());
  }
  
}
