package it.gssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UniversityOrganization.Department;
import it.gssi.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/all")
	public List<Department> allDepartments() {
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/{name_to_search}")
	public Department department(@PathVariable("name_to_search") String name_to_search) {
		return departmentService.getDepartment(name_to_search);
	}
}
