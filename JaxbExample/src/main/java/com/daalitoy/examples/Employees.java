package com.daalitoy.examples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

	@XmlElement(name = "EmployeeList")
	private EmployeeList empList = new EmployeeList();

	public EmployeeList getEmpList() {
		return empList;
	}
	
	
	
}
