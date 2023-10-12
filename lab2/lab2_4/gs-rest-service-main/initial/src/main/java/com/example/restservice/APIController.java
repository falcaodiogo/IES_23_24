package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class APIController {

	private static final String quote = "Hello, gorgeous.";
	private static final String show = "Funny Girl (1968)";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/quote")
	public Quote quote() {
		return new Quote(quote);
	}

	@GetMapping("/api/shows")
	public Show shows() {
		return new Show(counter.incrementAndGet(), show);
	}

	@GetMapping("/api/quotes")
    public String quotes(@RequestParam(name = "show", required = true, defaultValue = "could not find a movie") String show, Model model) {
        model.addAttribute("show", show);
        return "The show name is: " + show;
    }
}