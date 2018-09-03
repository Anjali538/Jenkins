package maven;

import static org.junit.Assert.*;

import org.junit.Test;


public class DummyTest {
	
	@Test
	
    public void sum(){
		System.out.println("Dummy");
		int a = 10;
		int b = 20;
		assertEquals(30, a+b);
	}
}
