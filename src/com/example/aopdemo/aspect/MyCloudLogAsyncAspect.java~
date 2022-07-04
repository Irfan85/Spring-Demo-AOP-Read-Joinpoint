package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAsyncAspect {
    @Before("com.example.aopdemo.aspect.MyAopExpressions.forDAOPackageNoGetterSetter()")
    public void logToColoudAsync() {
	System.out.println("\n **** Logging to cloud... ");
    }
}
