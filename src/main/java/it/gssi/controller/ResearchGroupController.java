package it.gssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UniversityOrganization.ResearchGroup;
import it.gssi.service.ResearchGroupService;

@RestController
@RequestMapping("/researchgroup")
public class ResearchGroupController {

	@Autowired
	private ResearchGroupService researchGroupService;
	
	
	@GetMapping("/all")
	public List<ResearchGroup> getAllResearchGroup() {
		return researchGroupService.getAllResearchGroups();
	}
	
	@GetMapping("/{name_to_search}")
	public ResearchGroup getResearchGroup(@PathVariable("name_to_search") String name_to_search) {
		return researchGroupService.getResearchGroup(name_to_search);
	}
}
