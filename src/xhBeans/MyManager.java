package xhBeans;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.interceptor.NameMatchTransactionAttributeSource;
import org.springframework.transaction.interceptor.TransactionProxyFactoryBean;

public class MyManager {
	public static void main(String[] args)
	{
		MyTarget target=new MyTarget();
		ProxyFactory pf=new ProxyFactory();
		//ProxyFactoryBean
		//Pointcut
		//NameMathchMethodPointcut
		//NameMatchMethodPointcutAdvisor 
		//pf.a
		//DriverManagerDataSource
	}

}
