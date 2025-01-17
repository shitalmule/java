package com.alighthub.bikeRent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alighthub.bikeRent.model.Feedback;
import com.alighthub.bikeRent.service.Feedback_service;

@RestController
@RequestMapping("/Feedback")
public class Feedback_Controller {

	@Autowired
	private Feedback_service feedbackService;

	@PostMapping("/")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		System.out.println(feedback.getFeedback_name());
		Feedback f = feedbackService.addFeedback(feedback);
		return f;

	}

	@PutMapping("/")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		Feedback f = feedbackService.updateFeedback(feedback);
		return f;

	}

	@GetMapping("/{id}")
	public Feedback getFeedback(@PathVariable int id) {
		Feedback f = feedbackService.getFeedback(id);
		return f;
	}

	@GetMapping("/")
	public List<Feedback> getAllFeedback() {
		List<Feedback> list = feedbackService.getAllFeedback();
		return list;

	}

	@DeleteMapping("/{id}")
	public String deleteFeedback(@PathVariable int id) {
		String msg = feedbackService.deleteFeedback(id);
		return msg;
	}

}
 