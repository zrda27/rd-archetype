package com.zengrd.${mainArtifactId}.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.zengrd.${mainArtifactId}.mapper")
public class DBConfig {

}
