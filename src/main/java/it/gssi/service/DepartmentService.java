package it.gssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UniversityOrganization.Department;
import it.gssi.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		return departmentRepository.getAllDepartments();
	}

	public Department getDepartment(String name_to_search) {
		return departmentRepository.getDepartment(name_to_search);
	}
}
