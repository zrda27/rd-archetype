#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package test.${package};

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ${package}.${mainClass}AdminRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=${mainClass}AdminRunner.class)
public class ${mainClass}AdminTester {
	@Test
	public void test(){
		System.out.println("test");
	}
}
