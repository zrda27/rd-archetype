package com.zengrd.${mainArtifactId}.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zengrd.common.remote.httpinvoke.HttpInvokeUtil;
import com.zengrd.${mainArtifactId}.service.DemoService;

@Configuration
public class ${mainClass}ServiceRPCConfig {
	@Value("${${mainArtifactId}.service.baseUrl}")
	private String ${mainArtifactId}ServiceBaseUrl;

	@Bean
	public DemoService demoService() {
		return HttpInvokeUtil.getHttpInvokerBean(${mainArtifactId}ServiceBaseUrl, DemoService.class);
	}

}
