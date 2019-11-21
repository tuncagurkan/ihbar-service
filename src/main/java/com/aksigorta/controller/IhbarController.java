package com.aksigorta.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ihbar-service")
public class IhbarController {

	private static final Logger logger = LoggerFactory.getLogger(IhbarController.class);

//	@Autowired
//	private EvrakConnector evrakConnector;

    @GetMapping(value = "/test/{name}")
    public List<String> ihbarAl(@PathVariable("name") String name) throws Exception {
    	logger.info("ihbarAl cagirildi. name: {}", name);

//		return evrakConnector.evrakIsimleriniGetir("test");
		List<String> testList = new ArrayList<>();
		testList.add("test content");
        return testList;
    }
	
}
