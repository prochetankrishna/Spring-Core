package com.hertzbit.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppDemo {

	
	public static void main(String[] args) {
		
		/*
		 <bean id="mathsDepartment"
		 	class="com.hertzbit.springdemo.MathsDepartment">
		 </bean>
		 */
//		ClassPathXmlApplicationContext applicationContext = new
//				ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringDemoConfig.class);
		
		/*for (String eachBean : applicationContext.getBeanDefinitionNames()) {
			System.out.println(eachBean);
		}*/
		
		MathsDepartment mathsDepartment = applicationContext.getBean(MathsDepartment.class);
		System.out.println(mathsDepartment.getDailyHomeWork());
		System.out.println(mathsDepartment.displayReportCard());
		
		PhysicsDepartment physicsDepartment = applicationContext.getBean(PhysicsDepartment.class);
		System.out.println(physicsDepartment.getDailyHomeWork());
		System.out.println(physicsDepartment.displayReportCard());
		
		SportsDepartment sportsDepartment = applicationContext.getBean(SportsDepartment.class);
		System.out.println(sportsDepartment.getDailyHomeWork());
		System.out.println(sportsDepartment.displayReportCard());
		
		System.out.println("*************************************");
		DatabaseConnection databaseConnection = applicationContext.getBean(DatabaseConnection.class);
		DatabaseConnection anotherDatabaseConnection = applicationContext.getBean(DatabaseConnection.class);
		System.out.println(anotherDatabaseConnection.hashCode());
		System.out.println(databaseConnection.hashCode());
		System.out.println(databaseConnection == anotherDatabaseConnection);
		System.out.println("*************************************");
		
		
		
		applicationContext.close();
				
	}
}
