package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("character")
public class WizardController {
	
	private static final String CHARACTER = "character";	
	
	@GetMapping(value = "/new-char/01_race")
	public String showCharWizRace(Model model) {
		CharacterDto character = new CharacterDto("C");
	    model.addAttribute(CHARACTER, character);
//	    model.addAttribute("races", raceService.findAll());
	    System.out.println(String.format("showCharWizRace - %s", character));
	    return "new-char/01_race";
	}

	@PostMapping(value = "/new-char/02_class")
	public String showCharWizClass(Model model, @ModelAttribute("character") CharacterDto character) {
	    model.addAttribute(CHARACTER, character);
//	    model.addAttribute("classes", charClassService.findAll());
	    System.out.println(String.format("showCharWizClass - %s", character));
	    return "new-char/02_class";
	}

	@PostMapping(value = "/new-char/03_attributes")
	public String showCharWizAttributes(Model model, @ModelAttribute("character") CharacterDto character) {
	    model.addAttribute(CHARACTER, character);
	    System.out.println(String.format("showCharWizAttributes - %s", character));
	    return "new-char/03_attributes";
	}

}
