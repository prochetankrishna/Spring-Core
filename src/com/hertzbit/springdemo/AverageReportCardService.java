package com.hertzbit.springdemo;

import org.springframework.stereotype.Component;

@Component
public class AverageReportCardService implements ReportCardService{

	@Override
	public String getReportCard() {
		return "Report Card : C+";
	}

}
