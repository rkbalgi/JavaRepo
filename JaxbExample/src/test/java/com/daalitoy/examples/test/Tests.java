package com.daalitoy.examples.test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Test;

import com.daalitoy.examples.Employee;
import com.daalitoy.examples.Employees;
import com.daalitoy.examples.Job;

public class Tests {

	@Test
	public void marshallTest() throws Exception {

		Employees empls = new Employees();

		Employee emp = new Employee();
		emp.setEmployeeName("Ragha");
		emp.setAge(34);
		emp.getJobs().add(new Job("TCS", 10));

		empls.getEmpList().getEmployees().add(emp);

		emp = new Employee();
		emp.setEmployeeName("Rob");
		emp.setAge(34);
		emp.getJobs().add(new Job("Sun Microsystems", 5));

		empls.getEmpList().getEmployees().add(emp);

		JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(empls, System.out);
		
	}
}
