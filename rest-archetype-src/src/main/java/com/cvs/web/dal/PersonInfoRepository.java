package com.cvs.web.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cvs.web.dto.PersonInfo;

@Repository
public interface PersonInfoRepository extends CrudRepository<PersonInfo,Long> {

}
