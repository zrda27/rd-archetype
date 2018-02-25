#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.zengrd.common.aop.EnableAOP;

@SpringBootApplication
@EnableAOP
public class ${mainClass}WebRunner extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(${mainClass}WebRunner.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(${mainClass}WebRunner.class);
	}
	
}
