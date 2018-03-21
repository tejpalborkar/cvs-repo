package com.cvs.web.service;

import java.util.List;

import com.cvs.web.dto.PersonInfo;

public interface PersonInfoService {
	
	void save(PersonInfo personInfo);

	List<PersonInfo> getAll();
	
	PersonInfo getPersonById(Long id);
	
	void deletePerson(Long id);
	
	void deleteAllPersons();
}
