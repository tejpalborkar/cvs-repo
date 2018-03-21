package com.cvs.web.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cvs.web.dto.LoggingInfo;
import com.cvs.web.dto.PersonInfo;
import com.cvs.web.service.LoggingService;
import com.cvs.web.service.PersonInfoService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v2/person")
public class PersonInfoController {

	@Autowired
	private PersonInfoService personInfoService;
	
	@PostMapping("/save")
	@Consumes(value= {"application/json"})
	
	@ApiOperation(value = "Save Person Info object to the application", notes = "Operations related to Person info",  response = PersonInfo.class, responseContainer = "Single")
	public PersonInfo save(@RequestBody PersonInfo personInfo) {
		personInfoService.save(personInfo);
		
		return personInfo;
		
	}
	
	@GetMapping("/allpersons")
	@Produces(value= {"application/json"})
	@ApiOperation(value = "Get All Person Info object to the application", notes = "Operations related to person info",  response = PersonInfo.class, responseContainer = "List")
	public  @ResponseBody  List<PersonInfo> getAllPerson() {
		return personInfoService.getAll();		
	}
	@GetMapping("/personbyid")
	@Produces(value= {"application/json"})
	@ApiOperation(value = "Get Person Info object to the application", notes = "Operations related to person info",  response = PersonInfo.class, responseContainer = "List")
	public  @ResponseBody  PersonInfo getPersonById(Long id) {
		return personInfoService.getPersonById(id);		
	}
	
	@PostMapping("/delete")
	@Consumes(value= {"application/json"})
	
	@ApiOperation(value = "Delete Person Info object to the application", notes = "Operations related to Person info",  response = PersonInfo.class, responseContainer = "Single")
	public void delete(@RequestParam Long id) {
		personInfoService.deletePerson(id);
	}
	
	@PostMapping("/deleteall")
	@Consumes(value= {"application/json"})
	
	@ApiOperation(value = "Delete All Person Info object to the application", notes = "Operations related to Person info",  response = PersonInfo.class, responseContainer = "Single")
	public void deleteall() {
		personInfoService.deleteAllPersons();
	}
}
