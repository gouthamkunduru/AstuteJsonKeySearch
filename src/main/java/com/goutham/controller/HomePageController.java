package com.goutham.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Implemented During Astute coding Challenge
 * Created by Goutham Kunduru on 09/02/2017.
 * 
 * @author Goutham Kunduru
 * @version 1.0
 */
@Controller
public class HomePageController {

	@GetMapping("/")
	public String index() {
		return "home";
	}
}
