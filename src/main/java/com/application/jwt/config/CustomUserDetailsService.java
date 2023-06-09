package com.application.jwt.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.application.jwt.entity.Employee;
import com.application.jwt.repository.EmployeeRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Employee> emp = employeeRepository.findByEmail(username);
		
		return emp.map(CustomUserDetails::new).orElseThrow(() -> new UsernameNotFoundException("invalid User"));

	}

}
