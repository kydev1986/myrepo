package com.course.coursedemo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	private ArrayList<String> textList;

	@PostConstruct
	private void loadData() {
		textList = new ArrayList<String>(Arrays.asList(
				"Logic will get you from A to B. Imagination will take you everywhere.",
				"There are 10 kinds of people. Those who know binary and those who don't.",
				"There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
				"It's not that I'm so smart, it's just that I stay with problems longer.",
				"It is pitch dark. You are likely to be eaten by a grue."));

	}

	// Create mapping for "/"
	@GetMapping("/")
	public String getText(Model theModel) {

		SplittableRandom random = new SplittableRandom();
		Integer number = random.nextInt(5);

		theModel.addAttribute("theText", textList.get(number));
		return "index";

	}
}
