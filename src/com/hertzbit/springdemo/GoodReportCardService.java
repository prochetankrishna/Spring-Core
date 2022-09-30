package com.hertzbit.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodReportCardService implements ReportCardService{

	@Override
	public String getReportCard() {
		return "Report Card : A+";
	}
}
