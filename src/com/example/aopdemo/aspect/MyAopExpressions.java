package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAopExpressions {
    // Declaring a pointcut expression for reuse
    @Pointcut("execution(* com.example.aopdemo.dao.*.*(..))")
    public void forDAOPackage() {}

    // Pointcut for getters
    @Pointcut("execution(* com.example.aopdemo.dao.*.get*(..))")
    public void forGetters() {
    }

    // Pointcut for setters
    @Pointcut("execution(* com.example.aopdemo.dao.*.set*(..))")
    public void forSetters() {
    }

    // Pointcut for all method of com.example.aopdemo.dao pacakge except for getters and setters
    @Pointcut("forDAOPackage() && !(forGetters() || forSetters())")
    public void forDAOPackageNoGetterSetter() {
    }
}
