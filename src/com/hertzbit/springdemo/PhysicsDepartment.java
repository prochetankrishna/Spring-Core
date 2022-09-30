package com.hertzbit.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PhysicsDepartment implements Department{

	@Autowired
	@Qualifier("goodReportCardService")
	private ReportCardService reportCardService;
	
	@Override
	public String getDailyHomeWork() {
		return "Solve Newton's Law Problems";
	}

	@Override
	public String displayReportCard() {
		return this.reportCardService.getReportCard();
	}
	
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println("Creating Paths Department Bean");
	}
	
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println("Destroying Paths Department Bean");
	}
}
