package com.example.fighterapp.repository;

import com.example.fighterapp.model.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FighterRepository extends JpaRepository<Fighter, Long> {

}