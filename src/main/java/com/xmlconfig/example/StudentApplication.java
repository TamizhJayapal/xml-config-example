package com.xmlconfig.example;
import com.xmlconfig.example.beans.WelcomMessage;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationConfig.xml");
		System.out.println(context.getBean("student"));
		//System.out.println(((WelcomMessage) context.getBean("welcomeMessage")).getMessage());
	
		
	}

}
