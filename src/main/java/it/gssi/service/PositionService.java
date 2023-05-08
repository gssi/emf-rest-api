package it.gssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UniversityOrganization.Position;
import it.gssi.repository.PositionRepository;

@Service
public class PositionService {

	@Autowired
	private PositionRepository positionRepository;

	public List<Position> getAllPosition() {
		return positionRepository.getAllPosition();
	}

	public Position getPosition(String name_to_search) {
		return positionRepository.getPosition(name_to_search);
	}
}
