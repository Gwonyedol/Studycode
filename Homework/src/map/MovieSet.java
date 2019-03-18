package map;

import java.util.Scanner;

public class MovieSet {
	public String[][] seat1;
	public String[][] seat2;
	public String[][] seat3;
	public Scanner sc;
	public int a;
	public int b;

	public MovieSet() {
		seat1 = new String[10][10]; // 영화관 좌석 100개
		seat2 = new String[10][10];
		seat3 = new String[10][10];
		sc = new Scanner(System.in);
		a = 0;
		b = 0;
		seatset();
	}

	public void seatset() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				seat1[i][j] = "□  ";
				seat2[i][j] = "□  ";
				seat3[i][j] = "□  ";
			}
		}
	}

	public void menu() {

		do {

			System.out.println("---------------------------------");
			System.out.println("--------♥영화 예매 프로그램♥--------");
			System.out.println("---------------------------------");
			System.out.println("1.영화 선택");
			System.out.println("");
			System.out.println("2.시스템 종료");
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("→원하시는 메뉴를 고세요");

			int choose;
			choose = Integer.parseInt(sc.nextLine());

			switch (choose) {
			case 1:
				M1();
				break;
			case 2:
				M2();
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;

			}

		} while (true);

	}

	public void M1() { // 영화선택
		System.out.println("영화를 선택하세요");
		System.out.println("1.귀여운예돌이");
		System.out.println("2.멋쟁이 예지의 디저트탐방기");
		System.out.println("3.수플레 팬케이크 조리과정");
		seatwhere sw = new seatwhere();

		int choose2;
		choose2 = Integer.parseInt(sc.nextLine());

		switch (choose2) {
		case 1:
			System.out.println("[귀여운예돌이]가 선택되었습니다");
			sw.Choose1();
			break;
		case 2:
			System.out.println("[멋쟁이 예지의 디저트탐방기]가 선택되었습니다");
			break;
		case 3:
			System.out.println("[수플레 팬케이크 조리과정]이 선택되었습니다");

			break;

		}

	}

	public void M2() {
		System.out.print("시스템 종료");
		System.exit(0);
	}

}

class seatwhere { // 영화 귀여운 예돌이 자리선택
	MovieSet ms = new MovieSet();

	public void Choose1() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ms.seat1[i][j]);
			}
			System.out.println();
		}

		System.out.println("행을 선택하시오");
		this.ms.a = Integer.parseInt(ms.sc.nextLine());

		System.out.println("열을 선택하시오");
		this.ms.b = Integer.parseInt(ms.sc.nextLine());

		System.out.println(ms.a + " , " + ms.b + " 자리가 선택되었습니다.");

		this.ms.seat1[ms.a][ms.b] = "■  ";
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ms.seat1[i][j]);
			}
			System.out.println();
		}
		
		ms.menu();

	}

}
