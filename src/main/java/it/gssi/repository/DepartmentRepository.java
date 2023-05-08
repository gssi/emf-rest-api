package it.gssi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import UniversityOrganization.Department;
import UniversityOrganization.UniversityOrganizationModel;
import it.gssi.utils.ModelUtils;

@Repository
public class DepartmentRepository {

	
	public List<Department> getAllDepartments() {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		return unOrganization.getDepartments();
	}
	
	
	public Department getDepartment(String name_to_search) {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		for (Department department : unOrganization.getDepartments()) {
			if(department.getName().equalsIgnoreCase(name_to_search)) {
				return department;
			}
			
		}
		return null;
	}
	
}
