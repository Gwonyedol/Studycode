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
		seat1 = new String[10][10]; // ��ȭ�� �¼� 100��
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
				seat1[i][j] = "��  ";
				seat2[i][j] = "��  ";
				seat3[i][j] = "��  ";
			}
		}
	}

	public void menu() {

		do {

			System.out.println("---------------------------------");
			System.out.println("--------����ȭ ���� ���α׷���--------");
			System.out.println("---------------------------------");
			System.out.println("1.��ȭ ����");
			System.out.println("");
			System.out.println("2.�ý��� ����");
			System.out.println("");
			System.out.println("---------------------------------");
			System.out.println("����Ͻô� �޴��� ����");

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
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;

			}

		} while (true);

	}

	public void M1() { // ��ȭ����
		System.out.println("��ȭ�� �����ϼ���");
		System.out.println("1.�Ϳ������");
		System.out.println("2.������ ������ ����ƮŽ���");
		System.out.println("3.���÷� ������ũ ��������");
		seatwhere sw = new seatwhere();

		int choose2;
		choose2 = Integer.parseInt(sc.nextLine());

		switch (choose2) {
		case 1:
			System.out.println("[�Ϳ������]�� ���õǾ����ϴ�");
			sw.Choose1();
			break;
		case 2:
			System.out.println("[������ ������ ����ƮŽ���]�� ���õǾ����ϴ�");
			break;
		case 3:
			System.out.println("[���÷� ������ũ ��������]�� ���õǾ����ϴ�");

			break;

		}

	}

	public void M2() {
		System.out.print("�ý��� ����");
		System.exit(0);
	}

}

class seatwhere { // ��ȭ �Ϳ��� ������ �ڸ�����
	MovieSet ms = new MovieSet();

	public void Choose1() {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ms.seat1[i][j]);
			}
			System.out.println();
		}

		System.out.println("���� �����Ͻÿ�");
		this.ms.a = Integer.parseInt(ms.sc.nextLine());

		System.out.println("���� �����Ͻÿ�");
		this.ms.b = Integer.parseInt(ms.sc.nextLine());

		System.out.println(ms.a + " , " + ms.b + " �ڸ��� ���õǾ����ϴ�.");

		this.ms.seat1[ms.a][ms.b] = "��  ";
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(ms.seat1[i][j]);
			}
			System.out.println();
		}
		
		ms.menu();

	}

}
