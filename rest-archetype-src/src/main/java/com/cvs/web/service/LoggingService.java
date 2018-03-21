package com.cvs.web.service;

import java.util.List;

import com.cvs.web.dto.LoggingInfo;

public interface LoggingService {

	void save(LoggingInfo loggingInfo);

	List<LoggingInfo> getAll();

}
