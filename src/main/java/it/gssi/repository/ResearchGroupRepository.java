package it.gssi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import UniversityOrganization.Department;
import UniversityOrganization.ResearchGroup;
import UniversityOrganization.UniversityOrganizationModel;
import it.gssi.utils.ModelUtils;

@Repository
public class ResearchGroupRepository {
	
	public List<ResearchGroup> getAllResearchGroup() {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		
		List<ResearchGroup> listResearchGroup = new ArrayList<ResearchGroup>();
		for (Department  department: unOrganization.getDepartments()) {
			listResearchGroup.addAll(department.getResearchGroups());
		}
		return listResearchGroup;
	}
	
	
	public ResearchGroup getResearchGroup(String name_to_search) {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		
		for (Department  department: unOrganization.getDepartments()) {
			for (ResearchGroup researchGroup : department.getResearchGroups()) {
				if(researchGroup.getName().equalsIgnoreCase(name_to_search)) {
					return researchGroup;
				}
			}
		}
		
		return null;
	}

}
