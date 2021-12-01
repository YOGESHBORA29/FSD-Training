package com.cofoge.training.mokitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
public class HelloWorld {
	@Test
	public void greetTest()
	{
		IDemo d=mock(IDemo.class); // create mock object if demo
		when(d.greet()).thenReturn(IDemo.S);
		System.out.println("Demo Greets :"+d.greet());
		assertEquals(d.greet(),IDemo.S);
	}
}