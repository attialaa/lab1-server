package com.example.fighterapp.controller;

import com.example.fighterapp.model.Fighter;
import com.example.fighterapp.repository.FighterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FighterController {

    @Autowired
    private FighterRepository fighterRepo;

    @GetMapping("/fighters")
    public String listFighters(Model model) {

        Pageable pageable = PageRequest.of(0,10);

        Page<Fighter> fighterPage = fighterRepo.findAll(pageable);

        model.addAttribute("fighters", fighterPage.getContent());

        return "Fighters";
    }
}