#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import com.zengrd.common.aop.EnableAOP;
import com.zengrd.common.remote.httpinvoke.EnableHttpExport;

@SpringBootApplication
@EnableHttpExport
@EnableAOP
public class ${mainClass}ServiceRunner extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(${mainClass}ServiceRunner.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(${mainClass}ServiceRunner.class);
	}
	
}
