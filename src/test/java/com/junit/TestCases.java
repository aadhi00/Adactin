package com.junit;

import org.junit.Assert;
import org.junit.Test;




public class TestCases {
	@Test
	public void tc01() {
		System.out.println("tc01----");
		System.out.println("step1");
		Assert.assertTrue(false);
		System.out.println("step2");
		Assert.assertTrue(true);
	}
	@Test
	public void tc02() {
		System.out.println("tc02---");
		System.out.println("step1");
		Assert.assertTrue(true);
		System.out.println("step2");
		Assert.assertTrue(true);
	}

}
