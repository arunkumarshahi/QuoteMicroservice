package com.test.quote.service;

import java.util.Arrays;
import java.util.List;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.quote.model.QuoteTO;


@FeignClient(name = "quoteapp", fallback = UserClientFallback.class)
@RibbonClient(name="quoteapp")
public interface ServiceClient {

	@GetMapping("/demo/api/getQuote")
	//@RequestMapping(method = RequestMethod.GET, value = "/demo/getQuote", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    //@RequestMapping(value = "/demo/getQuote/{quoteId}", method = RequestMethod.GET)
	//@GetMapping("/demo/getQuote")
	public List<QuoteTO>  getQuotes() ;
	
	@GetMapping("/demo/api/getQuote/{quoteId}")
	//@RequestMapping(method = RequestMethod.GET, value = "/demo/getQuote", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    //@RequestMapping(value = "/demo/getQuote/{quoteId}", method = RequestMethod.GET)
	//@GetMapping("/demo/getQuote")
	public QuoteTO  getSingleQuote(@PathVariable("quoteId") String quoteId) ;
	
	}

@Component
class UserClientFallback implements ServiceClient {
    

	@Override
	public List<QuoteTO> getQuotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuoteTO getSingleQuote(String quoteId) {
		// TODO Auto-generated method stub
		return null;
	}
}
