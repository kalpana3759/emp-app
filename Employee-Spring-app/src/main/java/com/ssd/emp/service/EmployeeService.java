package com.ssd.emp.service;

import javax.management.loading.PrivateClassLoader;

import com.ssd.emp.exception.EmployeeException;
import com.ssd.emp.model.Employee;
import com.ssd.emp.repo.EmployeeRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceI {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ModelMapper mapper;

	private Employee newEmp;
	private EmployeeDto newDto;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto dto) {

		Employee emp = mapper.map(dto, Employee.class);
		try {
			newEmp = employeeRepository.save(emp);
			newDto = mapper.map(newEmp, EmployeeDto.class);

		} catch (Exception e) {
			throw new EmployeeException("employee is already existed");

		}

		return newDto;
	}
 

	@Override
	public Double getEmployeeTaxDeductionCurrentYear(Long id) {
		Double taxDeduction = null;
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeException("Invalid Exception"));
		EmployeeDto empDto = mapper.map(employee, EmployeeDto.class);

		Double yearlySal = empDto.getSal() * 12;

		if (yearlySal <= 250000) {

			return taxDeduction = 0.0;
		} else if (yearlySal > 250000 && yearlySal <= 500000) {
			return taxDeduction = (yearlySal-250000) * 5 / 100;
		} else if (yearlySal > 500000 && yearlySal <= 1000000) {
	
			return taxDeduction = (yearlySal-250000) * 5 / 100 + (yearlySal-500000) * 10 / 100;
		} else if (yearlySal > 1000000) {
			return taxDeduction = (yearlySal-250000) * 20 / 100;
		}
		return taxDeduction;

	}

}
