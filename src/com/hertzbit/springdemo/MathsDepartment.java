package com.hertzbit.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Constructor Dependency Injection
@Component
public class MathsDepartment implements Department {
	
	private ReportCardService reportCardService;

	@Autowired
	public MathsDepartment(@Qualifier("badReportCardService") ReportCardService reportCardService) {
		this.reportCardService = reportCardService;
	}
	
	@Override
	public String getDailyHomeWork() {
		return "Solve 10 Integral Problems";
	}
	
	@Override
	public String displayReportCard() {
		return this.reportCardService.getReportCard();
	}
	
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println("Creating Maths Department Bean");
	}
	
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println("Destroying Maths Department Bean");
	}
}
