package it.gssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import UniversityOrganization.Position;
import it.gssi.service.PositionService;

@RestController
@RequestMapping("/position")
public class PositionController {

	@Autowired
	private PositionService positionService;
	
	
	@GetMapping("/all")
	@ResponseBody
	public List<Position> getAllPosition() {
		return positionService.getAllPosition();
	}
	
	@GetMapping("/{name_to_search}")
	@ResponseBody
	public Position getPosition(@PathVariable("name_to_search") String name_to_search) {
		return positionService.getPosition(name_to_search);
	}
}
