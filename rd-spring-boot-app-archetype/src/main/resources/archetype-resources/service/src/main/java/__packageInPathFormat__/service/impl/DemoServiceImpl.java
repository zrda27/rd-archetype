package com.zengrd.${mainArtifactId}.service.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zengrd.common.pojo.dto.ResultDTO;
import com.zengrd.common.remote.httpinvoke.HttpServiceExport;
import com.zengrd.${mainArtifactId}.mapper.DemoMapper;
import com.zengrd.${mainArtifactId}.pojo.domain.Demo;
import com.zengrd.${mainArtifactId}.service.DemoService;

@Service
@HttpServiceExport(interfaceService=DemoService.class)
public class DemoServiceImpl implements DemoService {
	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);
	@Autowired
	private DemoMapper demoMapper;

	@Override
	public ResultDTO<String> hello() {
		logger.info("service hello");
		return new ResultDTO<>("hello");
	}

	@Override
	public ResultDTO<Demo> add() {
		Demo demo = new Demo();
		demo.setName("test");
		demo.setStatus("Y");
		demoMapper.insert(demo);
		return new ResultDTO<>();
	}

	@Override
	public ResultDTO<String> del(Long id) {
		demoMapper.deleteByPrimaryKey(id);
		return new ResultDTO<>("成功");
	}
	
	@Override
	public ResultDTO<Demo> update(Long id) {
		Demo demo = demoMapper.selectByPrimaryKey(id);
		demo.setName("test" + new Random().nextLong());
		demoMapper.updateByPrimaryKeySelective(demo);
		return new ResultDTO<>();
	}
	
	@Override
	public ResultDTO<Demo> get(Long id) {
		return new ResultDTO<>(demoMapper.selectByPrimaryKey(id));
	}

}