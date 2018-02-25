package ${package}.service;

import com.zengrd.common.pojo.dto.ResultDTO;
import ${package}.pojo.domain.Demo;

public interface DemoService {
	ResultDTO<String> hello();
	
	ResultDTO<Demo> add();
	
	ResultDTO<String> del(Long id);

	ResultDTO<Demo> update(Long id);

	ResultDTO<Demo> get(Long id);
}
