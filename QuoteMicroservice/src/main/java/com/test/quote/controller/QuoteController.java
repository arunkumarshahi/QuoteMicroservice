package com.test.quote.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.quote.model.QuoteDAO;
import com.test.quote.repository.QuoteRepository;

@RestController
@RequestMapping("/demo")
public class QuoteController {
	private final QuoteRepository quoteRepository;

	public QuoteController(QuoteRepository quoteRepository) {
		super();
		this.quoteRepository = quoteRepository;
	}
	@GetMapping("/getQuote/{quoteId}")
	public QuoteDAO getQuote(@PathVariable String quoteId) {
		Optional<QuoteDAO> quoteDAO = quoteRepository.findById(quoteId);
		return quoteDAO.orElseThrow(()->new RuntimeException("invalid record...."));

	}
	
	@GetMapping("/getQuote")
	public List<QuoteDAO> getQuote1() {
		List<QuoteDAO> quoteDAO = quoteRepository.findAll();
		return quoteDAO;

	}
	
    @GetMapping("/")
	public String getQuote() {
		
		return "invalid record....";

	}
	@PostMapping("/createQuote")
	public QuoteDAO createQuote(@RequestBody QuoteDAO quoteDAO) {
		return quoteRepository.save(quoteDAO);
	}
}
