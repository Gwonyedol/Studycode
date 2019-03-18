package map;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class time extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("남은시간 : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class example implements Runnable {

	int a = 0;
	int b = 0;
	String inputdata = null;

	@Override
	public void run() {

		while (true) {
			test();
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
		}
	}

	public void test() {
//		ArrayList ex = new ArrayList();
//		for (int i = 0; i < ex.size(); i++) {
//			a = (int)(Math.random()*10)+1;
//			b = (int)(Math.random()*10)+1;
//			int c = a*b;
//			System.out.println("dd");
//			System.out.printf("%n X %n = %n",a,b,c);
//		}
	}
}

public class Game {

	public static void main(String[] args) {
		time t = new time();
		t.start();

		Thread ex = new Thread(new example());
		ex.setDaemon(true);
		ex.start();

	}

}
