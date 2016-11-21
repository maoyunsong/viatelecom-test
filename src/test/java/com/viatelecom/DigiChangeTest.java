package com.viatelecom;

import static org.junit.Assert.*;

import org.junit.Test;

import com.viatelecom.DigiChange;

public class DigiChangeTest {

	@Test
	public void tesConvert() {
		assertEquals("FooBar", DigiChange.convert(51));
		assertEquals("BarFoo", DigiChange.convert(53));
		assertEquals("FooQix", DigiChange.convert(21));
		assertEquals("Foo", DigiChange.convert(13));
		assertEquals("FooBarBar", DigiChange.convert(15));
		assertEquals("FooFooFoo", DigiChange.convert(33));
		assertEquals("1", DigiChange.convert(1));
		
		assertFalse("Foo".equals(DigiChange.convert(33)));
	}
	
}
