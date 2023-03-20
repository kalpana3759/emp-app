package com.ssd.emp.service;

public interface EmployeeServiceI {
	
	public EmployeeDto saveEmployee(EmployeeDto dto);
	
	public Double getEmployeeTaxDeductionCurrentYear(Long id);

}
