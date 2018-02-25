package com.zengrd.dept.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zengrd.common.pojo.dto.ResultDTO;
import com.zengrd.${mainArtifactId}.service.DemoService;

@RestController
@RequestMapping(path="/demo", produces={"application/json;charset=UTF-8"})
public class DemoController {
	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/hello")
	public ResultDTO<String> hello() throws IOException{
		logger.info("controller hello");
		return demoService.hello();
	}
}
