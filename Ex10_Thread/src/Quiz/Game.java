package Quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
class Timer extends Thread {
    public static boolean GameEnd = false;
    public int count;
 
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            try {
                System.out.println(i + " 초 남았습니다.");
                Thread.sleep(1000);
                count++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (count == 10) {
            GameEnd = true;
            End();
        }
    }
 
    public void End() {
        if (GameEnd == true) {
            System.out.println("시간초를 초과하셨습니다 다시 실행해주세요.");
            System.exit(0);
        }
    }
}
 
public class Game {
 
    public static void main(String[] args) {
 
        Timer ti = new Timer();
        ti.setDaemon(true);
        ti.start();
 
        int a = 0;
        int b = 0;
        int answer = 0;
        ArrayList<String> result = new ArrayList<String>();
 
            for (int i = 0; i < 5; i++) {
                a = ((int) (Math.random() * 8) + 2);
                b = ((int) (Math.random() * 9) + 1);
                System.out.println(a + "X" + b + " = " + "??");
                Scanner sc = new Scanner(System.in);
                answer = sc.nextInt();
                System.out.println("입력한 값은 " + answer + "입니다.");
                if (answer == a * b) {
                    result.add("O");
                } else {
                    result.add("X");
                }
            }
 
        String pp = "";
        Iterator<String> li = result.iterator();
        while (li.hasNext()) {
            pp += li.next() + ", ";
        }
        String wo = "[" + "결과 : " + pp + "]";
        System.out.println(wo);
        System.out.println("게임이 종료되었습니다.");
    }
}
 
