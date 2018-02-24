#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;

public class ${mainClass}ServiceRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(${mainClass}ServiceRunner.class, args);
	}
}
