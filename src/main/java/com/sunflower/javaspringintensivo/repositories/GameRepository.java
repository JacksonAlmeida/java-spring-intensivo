package com.sunflower.javaspringintensivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunflower.javaspringintensivo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
