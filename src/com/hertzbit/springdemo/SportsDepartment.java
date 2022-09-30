package com.hertzbit.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Setter Dependency Injection

@Component
public class SportsDepartment implements Department{

	private ReportCardService reportCardService;
	
	
	public ReportCardService getReportCardService() {
		return reportCardService;
	}

	@Autowired
	@Qualifier("averageReportCardService")
	public void setReportCardService(ReportCardService reportCardService) {
		this.reportCardService = reportCardService;
	}

	@Override
	public String getDailyHomeWork() {
		return "Pratice Batting for 60 minutes";
	}

	@Override
	public String displayReportCard() {
		return this.reportCardService.getReportCard();
	}
}
