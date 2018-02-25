package ${package}.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zengrd.common.remote.httpinvoke.HttpInvokeUtil;
import ${package}.service.DemoService;

@Configuration
public class ${mainClass}ServiceRPCConfig {
	@Value("${${artifactId}.service.baseUrl}")
	private String ${artifactId}ServiceBaseUrl;

	@Bean
	public DemoService demoService() {
		return HttpInvokeUtil.getHttpInvokerBean(${artifactId}ServiceBaseUrl, DemoService.class);
	}

}
