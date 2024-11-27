package com.abhi.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CheckFamily {

	@Autowired
	@Qualifier("daughter")
	Shankar s;

	public void check() {
		s.myChild();
	}

}
