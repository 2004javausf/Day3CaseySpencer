package com.revature.stats;

public class Ailments {
	
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
