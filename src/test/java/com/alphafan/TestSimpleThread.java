package com.alphafan;

import org.junit.Test;

public class TestSimpleThread {

	@Test
	public void testSimpleThread(){
		SimpleThread t1 = new SimpleThread("AAAAAA");
		SimpleThread t2 = new SimpleThread("BBBBBB");
		t1.start();
		t2.start();
	}
}
