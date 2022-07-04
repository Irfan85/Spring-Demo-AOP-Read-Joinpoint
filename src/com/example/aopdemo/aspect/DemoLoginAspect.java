package com.example.aopdemo.aspect;

import com.example.aopdemo.Account;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoginAspect {

    // Reusing a pointcut expression that was declared before 
    // Works for all methods in a specific package located in any class with any parameter(s)
    @Before("com.example.aopdemo.aspect.MyAopExpressions.forDAOPackageNoGetterSetter()")
    public void beforeAnyMethodOfAPackage(JoinPoint joinpoint) {
    	System.out.println("\n ***** This executes before calling any method of com.example.aopdemo.dao package with any return type and parameters");

	// Getting method signature
    	MethodSignature methodSignature = (MethodSignature) joinpoint.getSignature();
    	System.out.println("Method: " + methodSignature);

	// Getting method arguments
	Object[] arguments = joinpoint.getArgs();

	for (Object arg : arguments) {
		System.out.println(arg);

		if (arg instanceof Account) {
		    // Downcast and get specific information
		    Account account = (Account) arg;
		    System.out.println("Account name: " + account.getName());
		    System.out.println("Account email: " + account.getEmail());
		}
	}
    }

}

