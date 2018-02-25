#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package test.${package};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ${package}.${mainClass}WebRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=${mainClass}WebRunner.class)
public class ${mainClass}WebTester {
	@Test
	public void test(){
		System.out.println("test");
	}
}
