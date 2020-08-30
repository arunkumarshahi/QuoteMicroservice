package com.test.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.test.quote.model.QuoteTO;
import com.test.quote.service.ServiceClient;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/client")
@Slf4j
public class ClientController {
//
////    @Autowired
////    private DiscoveryClient discoveryClient;
//
//    @Autowired
//    private ClientConfig config;

    
    @Autowired
    ServiceClient serviceClient;
    
    @GetMapping("/proxy")
    public List<QuoteTO> findByOrganizationWithEmployees() {
     log.info("*********** proxy is called here *********");
     List<QuoteTO> departments = serviceClient.getQuotes();
    
     if(departments==null) {
    	 log.info("*********** proxy is called in not null *********");
     }else {
    	 log.info("*********** proxy is called here in null*********");
     }
     return departments;
    }

    @GetMapping("/proxy/{quoteId}")
    public QuoteTO findQuoteById(@PathVariable("quoteId") String quoteId) {
     log.info("*********** proxy is called here *********");
     QuoteTO departments = serviceClient.getSingleQuote(quoteId);
    
     if(departments==null) {
    	 log.info("*********** proxy is called in not null *********");
     }else {
    	 log.info("*********** proxy is called here in null*********");
     }
     return departments;
    }
    
    @GetMapping("/services")
    public ResponseEntity<?> services()  {
       // return new ResponseEntity<Object>(discoveryClient.getServices(), HttpStatus.OK);
    	return new ResponseEntity<Object>("arun k", HttpStatus.OK);
    }

    
    @RequestMapping("/deals")
    public String getDeals() {
    	// Object departments = serviceClient.getQuote("5f48e3b7b43fb76c2d70a8f5");
    	    
         return String.valueOf("arun k");
    }

    @GetMapping
    public String load() {

       // RestTemplate restTemplate = new RestTemplate();
       // String resourceUrl = "http://172.17.0.4:8080/getQuote/5f48cfe6bab622177b823cc2";
       // ResponseEntity<String> response = restTemplate.getForEntity(resourceUrl, String.class);

//        String serviceList = "";
//        if (discoveryClient != null) {
//            List<String> services = this.discoveryClient.getServices();
//
//            for (String service : services) {
//
//                List<ServiceInstance> instances = this.discoveryClient.getInstances(service);
//
//                serviceList += ("[" + service + " : " + ((!CollectionUtils.isEmpty(instances)) ? instances.size() : 0) + " instances ]");
//            }
//        }
//
//        return String.format(config.getMessage(), "****", serviceList);
    	return "X";
    }
    
   
}
