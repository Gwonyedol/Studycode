package map;

import java.io.Serializable;
import java.util.Scanner;

public class BMI implements Serializable {
	private double length = 0;
	private double weight = 0;
	private double result = 0;
	private String you = null;

	public BMI input(BMI bmi) {
//		Ű.�����Թް�
//		�񸸵� = ü��/(Ű/100)^2
//		����(ü�߰����� ǥ��)
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("Ű�� �Է��ϼ���! : ");
		this.length = sc.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���! : ");
		this.weight = sc.nextDouble();
		result = weight / Math.pow((length / 100.0), 2);
		if (this.result < 18.5) {
			this.you = "ü�� ����";
		} else if (18.5 <= this.result && this.result <= 22.9) {
			this.you = "����";
		} else if (23.0 <= this.result && this.result <= 24.9) {
			this.you = "��ü��";
		} else if (25.0 <= this.result) {
			this.you = "��";
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