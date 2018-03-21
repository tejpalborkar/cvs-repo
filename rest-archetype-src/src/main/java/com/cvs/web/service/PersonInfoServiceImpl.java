package com.cvs.web.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvs.web.dal.PersonInfoRepository;
import com.cvs.web.dto.PersonInfo;

@Service
public class PersonInfoServiceImpl implements PersonInfoService{
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(LoggingServiceImpl.class);

	@Autowired
	private PersonInfoRepository personInfoRepository;
	@Override
	public void save(PersonInfo personInfo) {
		// TODO Auto-generated method stub
		LOGGER.info("Entering save person");
		personInfoRepository.save(personInfo);
		
	}

	@Override
	public List<PersonInfo> getAll() {
		// TODO Auto-generated method stub
		LOGGER.info("Entering getAll person");
		return (List<PersonInfo>) personInfoRepository.findAll();
	}

	@Override
	public PersonInfo getPersonById(Long id) {
		// TODO Auto-generated method stub
		LOGGER.info("Entering getPersonById");
		return personInfoRepository.findOne(id);
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		LOGGER.info("Entering deletePerson");
		personInfoRepository.delete(id);
	}

	@Override
	public void deleteAllPersons() {
		// TODO Auto-generated method stub
		LOGGER.info("Entering deleteAllPersons");
		personInfoRepository.deleteAll();
		
	}

}
