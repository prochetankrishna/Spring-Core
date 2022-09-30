package com.hertzbit.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MathsDepartment implements Department {
	
	@Autowired
	@Qualifier("badReportCardService")
	private ReportCardService reportCardService;

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
