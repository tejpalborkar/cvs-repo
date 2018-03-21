package com.cvs.web.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cvs.web.dto.LoggingInfo;

@Repository
public interface LoggingInfoRepository extends CrudRepository<LoggingInfo, Long> {

}
