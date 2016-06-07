/**
 * 
 */
package xhAOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author Administrator
 *
 */
public class MethodAfterInterceptor implements AfterReturningAdvice {
   public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable
   {
	   System.out.println("after method,method name is:"+arg1.getName());
   }
}
