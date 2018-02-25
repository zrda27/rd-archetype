#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package test.${package};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ${package}.${mainClass}ServiceRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=${mainClass}ServiceRunner.class)
public class ${mainClass}ServiceTester {
	@Test
	public void test(){
		System.out.println("test");
	}
}
