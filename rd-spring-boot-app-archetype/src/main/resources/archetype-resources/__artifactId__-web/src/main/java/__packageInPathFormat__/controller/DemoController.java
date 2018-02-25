package ${package}.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zengrd.common.pojo.dto.ResultDTO;
import ${package}.pojo.domain.Demo;
import ${package}.service.DemoService;

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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResultDTO<Demo> add() {
		return demoService.add();
	}

	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	public ResultDTO<String> del(@PathVariable Long id) {
		return demoService.del(id);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.PUT)
	public ResultDTO<Demo> update(@PathVariable Long id) {
		return demoService.update(id);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.GET)
	public ResultDTO<Demo> get(@PathVariable Long id) {
		return demoService.get(id);
	}
}
