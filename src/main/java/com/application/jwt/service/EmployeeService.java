package com.application.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.jwt.entity.Employee;
import com.application.jwt.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private PasswordEncoder passEncoder;

	public Employee save(Employee employee) {
		employee.setPassword(passEncoder.encode(employee.getPassword()));
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getByEmployee(Integer id) {
		return employeeRepository.findById(id).get();
	}

}
