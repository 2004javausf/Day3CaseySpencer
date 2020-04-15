package com.revature.stats;

public class Vitals {
	
	int maxHp = 0;
	int currentHp = 0;
	int maxMp = 0;
	int currentMp = 0;
	
	Vitals (int maxHP, int maxMP){
		this.maxHp = maxHp;
		currentHp = maxHp;
		this.maxMp = maxMp;
		currentMp = maxMp;
	}

	@Override
	public String toString() {
		return "Vitals [maxHp=" + maxHp + ", currentHp=" + currentHp + ", maxMp=" + maxMp + ", currentMp=" + currentMp
				+ "]";
	}

	public int getCurrentHp() {
		return currentHp;
	}

	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getCurrentMp() {
		return currentMp;
	}

	public void setCurrentMp(int currentMp) {
		this.currentMp = currentMp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}
	
	
	
}
