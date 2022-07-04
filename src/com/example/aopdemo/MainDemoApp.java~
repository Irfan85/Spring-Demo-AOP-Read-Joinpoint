package com.example.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		accountDAO.addAccount();

		accountDAO.setName("Account DAO 1");
		accountDAO.setServiceCode("Service 1");

		membershipDAO.addAccount();
		
		// Account account1 = new Account();
		// accountDAO.addAccount(account1);
		// accountDAO.addAccount(account1, true);
		
		context.close();
	}

}
