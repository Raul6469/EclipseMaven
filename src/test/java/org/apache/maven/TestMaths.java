package org.apache.maven;

import junit.framework.TestCase;

public class TestMaths extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

		
	public void testSum() {
		assertEquals(Maths.sum(2, 3),5);
	}

}
