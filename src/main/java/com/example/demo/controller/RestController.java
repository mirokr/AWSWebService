package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.Boat;
import com.example.demo.dto.BoatUpdateRequest;

@Controller
public class RestController {
	
	@Autowired
	Boat boat;
	
	
	
	@RequestMapping("/hi")
	@PostMapping
	@ResponseBody
	public Boat sayHi(@RequestBody Boat boat) {
		
		BoatUpdateRequest request = new BoatUpdateRequest();
		request.setPrediction(boat);
		boat.setPrice_prediction(request.getPrice_prediction());
		
		return boat;
	}

}
