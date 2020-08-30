package com.test.quote.service;

import java.util.Arrays;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name = "quoteapp", fallback = UserClientFallback.class)
//@FeignClient(name = "hello-service", fallback = UserClientFallback.class)
public interface ServiceClient {

	//@GetMapping("/demo/getQuote/{quoteId}")
	@RequestMapping(method = RequestMethod.GET, value = "/demo/getQuote", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    //@RequestMapping(value = "/demo/getQuote/{quoteId}", method = RequestMethod.GET)
	public Object  getQuote() ;
	}

@Component
class UserClientFallback implements ServiceClient {
    @Override
    public Object getQuote() {
        return Arrays.asList("Hello", "tryGetGreetingsElse");
    }
}
