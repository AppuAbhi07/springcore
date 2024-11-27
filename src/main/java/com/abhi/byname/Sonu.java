package com.abhi.byname;

import org.springframework.stereotype.Service;

@Service("daughter")
public class Sonu extends Shankar{

	@Override
	public void myChild() {
		 System.out.println("I am Shankar daughter");
	}
}
