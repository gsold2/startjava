package com.startjava.lesson_2_3.robot;

public class Jaeger {
	int launchedYear;
	String mark;
	String origin;
	boolean status;
	float height;
	float weight;
	int speed;
	int strength;
	int armor;
	String energyCore;
	String bodyLanguage;
	int kajuKillded;

	public Jaeger(int launchedYear, String mark, String origin, boolean status,
				float height, float weight, int speed, int strength, int armor,
				String energyCore, String bodyLanguage, int kajuKillded) {
		this.launchedYear = launchedYear;
		this.mark = mark;
		this.origin = origin;
		this.status = status;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
		this.energyCore = energyCore;
		this.bodyLanguage = bodyLanguage;
		this.kajuKillded = kajuKillded;
	}

	public void setLaunchedYear(int launchedYear) {
		this.launchedYear = launchedYear;
	}
	public int getlaunchedYear() {
		return launchedYear;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getOrigin() {
		return origin;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStrength() {
		return strength;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getArmor() {
		return armor;
	}

	public void setEnergyCore(String energyCore) {
		this.energyCore = energyCore;
	}
	public String getEnergyCore() {
		return energyCore;
	}

	public void setBodyLanguage(String bodyLanguage) {
		this.bodyLanguage = bodyLanguage;
	}
	public String getBodyLanguage() {
		return bodyLanguage;
	}

	public void setKajuKillded(int kajuKillded) {
		this.kajuKillded = kajuKillded;
	}
	public int getKajuKillded() {
		return kajuKillded;
	}

	public void status() {
		System.out.print(
		"launchedYear = " + launchedYear + "\n" +
		"mark = " + mark + "\n" +
		"origin = " + origin + "\n" +
		"status = " + status + "\n" +
		"height = " + height + "\n" +
		"weight = " + weight + "\n" +
		"speed = " + speed + "\n" +
		"strength = " + strength + "\n" +
		"armor = " + armor + "\n" +
		"energyCore = " + energyCore + "\n" +
		"bodyLanguage = " + bodyLanguage + "\n" +
		"kajuKillded = " + kajuKillded + "\n"
		);
	}
}
