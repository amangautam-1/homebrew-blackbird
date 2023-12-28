package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DemoApplicationTests {
	DemoApplication demoApplication = new DemoApplication();


	@Test
	public void test(){
		assert demoApplication.test() == 1;
	}

}
