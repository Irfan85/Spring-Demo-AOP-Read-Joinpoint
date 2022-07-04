package com.example.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.aopdemo.dao.AccountDAO;
import com.example.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		Account account1 = new Account();
		account1.setName("Akkas Ali");
		account1.setEmail("akkasali@gmail.com");
		
		accountDAO.addAccount(account1);
		accountDAO.addAccount(account1, true);

		accountDAO.setName("Account DAO 1");
		accountDAO.setServiceCode("Service 1");

		membershipDAO.addAccount();
		
	
		context.close();
	}

}
