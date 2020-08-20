package com.cts.brownfield.pss.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.brownfield.pss.entity.Flight;

//@FeignClient(name = "search-service", url = "http://localhost:8082/api/pss")
@FeignClient(name="search-service") // http://search-proxy/api/pss/1024
public interface SearchServiceProxy {
	@GetMapping(value = "/api/pss/findFlight/{id}")
	Flight findFlight(@PathVariable long id);
	
}
