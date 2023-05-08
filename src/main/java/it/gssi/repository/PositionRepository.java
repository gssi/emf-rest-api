package it.gssi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import UniversityOrganization.Department;
import UniversityOrganization.Position;
import UniversityOrganization.ResearchGroup;
import UniversityOrganization.UniversityOrganizationModel;
import it.gssi.utils.ModelUtils;

@Repository
public class PositionRepository {
	
	public List<Position> getAllPosition() {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		
		List<Position> listPosition = new ArrayList<Position>();
		for (Department  department: unOrganization.getDepartments()) {
			for (ResearchGroup researchGroup : department.getResearchGroups()) {
				listPosition.addAll(researchGroup.getOpenPosition());
			}
		}
		return listPosition;
	}
	
	
	public Position getPosition(String name_to_search) {
		ModelUtils modelUtils = new ModelUtils();
		UniversityOrganizationModel unOrganization = modelUtils.loadModel();
		
		for (Department  department: unOrganization.getDepartments()) {
			for (ResearchGroup researchGroup : department.getResearchGroups()) {
				for (Position position : researchGroup.getOpenPosition()) {
					if(position.getProjectTitle().equalsIgnoreCase(name_to_search)) {
						return position;
					}
				}
			}
		}
		return null;
	}

}
