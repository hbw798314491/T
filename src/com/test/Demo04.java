package com.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;



public class Demo04 {

	@Test
	public void test() {
	
		String name = "key";
		int age = 23;
		Map<String,Object>map = new HashMap<String,Object>();
		
		map.put(name,"value");
		
		map.put("book",age);
		
		int b = (int)map.get("book");
		
		for(int num = 0 ; num<10;num++) {
			
			b++;
			System.out.println("运行了"+num+"次");
			
		}
		System.out.println(map);
		System.out.println(b);
		
		
		
		
	}
}
