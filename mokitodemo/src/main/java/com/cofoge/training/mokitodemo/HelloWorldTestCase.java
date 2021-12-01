package com.cofoge.training.mokitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTestCase {
private IDemo d;
	@Before
	public void setUp() throws Exception {
		d=mock(IDemo);
		When(d.greet().thenReturn(IDemo.S));
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		System.out.println("DemoGreet:"+d.greet());
		assertEquals("Helow world",d.greet());
	}

}
