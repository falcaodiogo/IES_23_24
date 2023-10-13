package com.example.restservice;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class APIController {

	private static final String quote = "Hello, gorgeous.";
	private static final String show = "Show";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/api/quote")
	public Quote quote() {
		return new Quote(quote);
	}

	@GetMapping("/api/shows")
	public Show shows() {
		HashMap<Integer, String> showsAndIds = new HashMap<Integer, String>();
		showsAndIds.put(0, "Be a pupkin do my ogre!");
		showsAndIds.put(1, "Slay the house down!");
		showsAndIds.put(2, "Be pretty and your life will be easy");
		showsAndIds.put(3, "Or nor!");

		Random random = new Random();
        int randomKey = random.nextInt(4);

        String randomString = showsAndIds.get(randomKey);

		return new Show(counter.incrementAndGet(), randomString);
	}

	// static
	@GetMapping("/api/quotes")
    public String quotes(@RequestParam(name = "show", required = true, defaultValue = "could not find a movie") String show, Model model) {
        if ("1".equals(show)) {
			model.addAttribute("show", "Mean Girls");
			return "Mean Girls";
		} else if ("2".equals(show)) {
			model.addAttribute("show", "CountVill");
			return "CountVill";
		} else if ("3".equals(show)) {
			model.addAttribute("show", "Miss Peregrine");
			return "Miss Peregrine";
		} else {
			model.addAttribute("show", "The show name is: " + show);
		}
		return show; 
	
    }
}