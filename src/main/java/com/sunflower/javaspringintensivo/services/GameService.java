package com.sunflower.javaspringintensivo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.javaspringintensivo.dto.GameMinDTO;
import com.sunflower.javaspringintensivo.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> gamesDTO = gameRepository.findAll().stream()
		.map(game -> new GameMinDTO(game))
		.collect(Collectors.toList());
		return gamesDTO;
	}
	
}
