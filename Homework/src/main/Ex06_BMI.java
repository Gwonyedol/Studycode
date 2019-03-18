package main;

import java.util.HashMap;
import java.util.Scanner;
import map.BMI;

public class Ex06_BMI {
	static HashMap<Integer, BMI> map = new HashMap<Integer, BMI>(); // point
	static int count = 1;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Ex06_BMI bc = new Ex06_BMI();
		while (true) {
			System.out.println("--------------------------------------------");
			System.out.println("비만도(BIM)측정기계");
			System.out.print("(1)정보입력 및 추가 \n (2)삭제 \n <3>출력 <4>저장 <5>로드 <6>종료 : ");

			switch (scanner.nextInt()) {
			case 1:
				bc.add();
				break;
			case 2:
				bc.delete();
				break;
			case 3:
				bc.print();
				break;
			case 4:
				bc.save();
				break;
			case 5:
				bc.load();
				break;
			case 6:
				bc.exit();
				break;

			}// switch
		} // while
	}// main

	private void add() {
//		BMI 객체 생성
//		맵에 추가
	}

	private void load() {

	}

	private void print() {

	}

	private void save() {
	}

	private void exit() {

	}

	private void delete() {

	}

}
