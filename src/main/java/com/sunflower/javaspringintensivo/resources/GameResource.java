package com.sunflower.javaspringintensivo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.javaspringintensivo.dto.GameMinDTO;
import com.sunflower.javaspringintensivo.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll(){
		List<GameMinDTO> games = gameService.findAll();
		return ResponseEntity.ok().body(games);
	}
}
