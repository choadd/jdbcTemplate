package net.edupoll.kr.entity;

import org.springframework.stereotype.Component;

@Component
public class BodyMassVO {

	int cm, kg, age, rate;
	String result;

	public int getCm() {
		return cm;
	}

	public void setCm(int cm) {
		this.cm = cm;
	}

	public int getKg() {
		return kg;
	}

	public void setKg(int kg) {
		this.kg = kg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
