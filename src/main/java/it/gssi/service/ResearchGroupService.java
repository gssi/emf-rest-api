package it.gssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UniversityOrganization.ResearchGroup;
import it.gssi.repository.ResearchGroupRepository;

@Service
public class ResearchGroupService {

	@Autowired
	private ResearchGroupRepository researchGroupRepository;

	public List<ResearchGroup> getAllResearchGroups() {
		return researchGroupRepository.getAllResearchGroup();
	}

	public ResearchGroup getResearchGroup(String name_to_search) {
		return researchGroupRepository.getResearchGroup(name_to_search);
	}
}
