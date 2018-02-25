package com.zengrd.dept.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"com.zengrd.fantast17.repo"})
@EnableTransactionManagement
public class DBConfig {

}
