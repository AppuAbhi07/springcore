package com.abhi.byname;

import org.springframework.stereotype.Service;

@Service("son")
public class Chetu extends Shankar {

	@Override
	public void myChild() {
		 System.out.println("i am Shankar son");
	}
	
}
