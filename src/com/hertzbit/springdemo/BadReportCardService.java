package com.hertzbit.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadReportCardService implements ReportCardService{

	@Override
	public String getReportCard() {
		return "Report Card : F";
	}
}
