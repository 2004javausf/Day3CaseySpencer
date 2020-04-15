package com.revature.stats;

import java.util.Arrays;

public class Ailments {
	
	@Override
	public String toString() {
		return "Ailments [ailments=" + Arrays.toString(ailments) + "]";
	}

	String[] ailments = new String[10];

	public String[] getAilments() {
		return ailments;
	}

	public void addAilments(String ailment) {
		for (int i=0; i<10; i++) {
			if (ailments[i].equals("")) {
				ailments[i] = ailment;
				i=10;
			}
			
		}
	}
	
	

}
