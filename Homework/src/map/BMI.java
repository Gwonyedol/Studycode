package map;

import java.io.Serializable;
import java.util.Scanner;

public class BMI implements Serializable {
	private double length = 0;
	private double weight = 0;
	private double result = 0;
	private String you = null;

	public BMI input(BMI bmi) {
//		키.몸무게받고
//		비만도 = 체중/(키/100)^2
//		저장(체중과부족 표시)
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("키를 입력하세요! : ");
		this.length = sc.nextDouble();
		System.out.println("몸무게를 입력하세요! : ");
		this.weight = sc.nextDouble();
		result = weight / Math.pow((length / 100.0), 2);
		if (this.result < 18.5) {
			this.you = "체중 부족";
		} else if (18.5 <= this.result && this.result <= 22.9) {
			this.you = "정상";
		} else if (23.0 <= this.result && this.result <= 24.9) {
			this.you = "과체중";
		} else if (25.0 <= this.result) {
			this.you = "비만";
		}
		return bmi;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getYou() {
		return you;
	}

	public void setYou(String you) {
		this.you = you;
	}

}