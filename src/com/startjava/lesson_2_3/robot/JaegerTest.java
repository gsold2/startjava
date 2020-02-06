package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		//TODO создаем двух егерей ссылни на описание ниже
		//https://pacificrim.fandom.com/wiki/Striker_Eureka_(Jaeger)
		//https://pacificrim.fandom.com/wiki/Cherno_Alpha_(Jaeger)
		Jaeger strikerEureka = new Jaeger(
			2019,
			"Mark-5",
			"Australia",
			false,
			76.2f,
			1.85f,
			10,
			10,
			9,
			"XIG Supercell Chamber",
			"Dirty Boxer",
			10
		);
		strikerEureka.status();

		Jaeger chernoAlpha = new Jaeger(
			2015,
			"Mark-1",
			"Russia",
			false,
			85.34f,
			2.412f,
			3,
			10,
			9,
			"Stun Core 08",
			"DGreco-Roman wrestling/boxing",
			8
		);
		chernoAlpha.status();

		System.out.println(chernoAlpha.getMark() + " убил " + chernoAlpha.getKajuKillded());
		chernoAlpha.setKajuKillded(9);
		System.out.println(chernoAlpha.getMark() + " убил " + chernoAlpha.getKajuKillded());

		System.out.println(chernoAlpha.getMark() + " создан в " + chernoAlpha.getOrigin());
		chernoAlpha.setOrigin("Лукоморье");
		System.out.println(chernoAlpha.getMark() + " создан в " + chernoAlpha.getOrigin());
	}
}
