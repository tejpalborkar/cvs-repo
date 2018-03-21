package com.cvs.web.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.web.dto.LoggingInfo;
import com.cvs.web.service.LoggingService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/logging")
public class LoggingController {
	
	@Autowired
	private LoggingService loggingService;
	
	@PostMapping("/save")
	@Consumes(value= {"application/json"})
	
	@ApiOperation(value = "Save Logging Info object to the application", notes = "Operations related to logging info",  response = LoggingInfo.class, responseContainer = "Single")
	public LoggingInfo save(@RequestBody LoggingInfo loggingInfo) {
		loggingService.save(loggingInfo);
		
		return loggingInfo;
		
	}
	
	@GetMapping("/all")
	@Produces(value= {"application/json"})
	@ApiOperation(value = "Get All Logging Info object to the application", notes = "Operations related to logging info",  response = LoggingInfo.class, responseContainer = "List")
	public  @ResponseBody  List<LoggingInfo> getAll() {
//		l.
		return loggingService.getAll();		
	}


}
