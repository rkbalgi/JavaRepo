package com.daalitoy.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Job {

	@XmlElement(name = "companyName")
	private String companyName;

	@XmlElement(name = "noOfYears")
	private int noOfYears;

	public Job(String string, int i) {
		this.companyName=string;
		this.noOfYears=i;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

}
