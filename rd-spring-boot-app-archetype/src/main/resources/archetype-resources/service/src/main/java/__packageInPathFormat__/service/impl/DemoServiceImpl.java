package com.zengrd.dept.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.zengrd.common.pojo.dto.ResultDTO;
import com.zengrd.common.remote.httpinvoke.HttpServiceExport;
import com.zengrd.${mainArtifactId}.service.DemoService;

@Service
@HttpServiceExport(interfaceService=DemoService.class)
public class DemoServiceImpl implements DemoService {
	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Override
	public ResultDTO<String> hello() {
		logger.info("service hello");
		return new ResultDTO<>("hello");
	}
}
