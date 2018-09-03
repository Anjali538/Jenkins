package maven;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {
	
	@Test
	
    public void sum(){
		System.out.println("Sum");
		int a = 10;
		int b = 20;
		assertEquals(30, a+b);
	}
}
