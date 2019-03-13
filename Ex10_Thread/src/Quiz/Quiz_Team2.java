package Quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;
 
// �������� ��������
// �ð��� �þ
// ������ ���� ������ ���� �þ
// Ÿ�̸Ӱ� ������ ����
// ������ ���� ������ ���� ����
 
class GuGuDan implements Runnable {
  static boolean isRight = false;
  static Map<String, Integer> answers = new HashMap<>(); 
 
  @Override
  public void run() {
    while (true) {
      Random r = new Random();
      int a = r.nextInt(9) + 1;
      int b = r.nextInt(9) + 1;
      int answer = a * b;
      answers.put((a + " X " + b), answer);
      String inputData = JOptionPane.showInputDialog(a + " X " + b + "?");
      try {
        if (answer == Integer.parseInt(inputData)) {
          isRight = true;
          Quiz_Team2.OX.add("O");
        } else {
          Quiz_Team2.OX.add("X");
        }
      } catch (NumberFormatException e) {
        inputData = "0";
      }
      if (Quiz_Team2.gameOver) {
        break;
      }
    }
  }
}
 
public class Quiz_Team2 {
  static List<String> OX = new ArrayList<>();
  static boolean gameOver = false;
 
  public static void main(String[] args) {
    Thread gugu = new Thread(new GuGuDan());
 
    gugu.start();
 
    for (int i = 10; i >= 0; i--) {
      try {
        System.out.println("���� �ð� : " + i);
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (GuGuDan.isRight) {
        if (OX.size() < 5) {
          i += 2;
          System.out.println("2�� �߰�");
        } else if (OX.size() < 10) {
          i += 1;
          System.out.println("1�� �߰�");
        }
        GuGuDan.isRight = false;
      }
    }
 
    gameOver = true;
    System.out.println("���� ����");
    System.out.println("Ǯ���� ������ ��");
    for (String s : GuGuDan.answers.keySet()) {
      System.out.println(s + " : " + GuGuDan.answers.get(s));
    }
    System.out.println("���� : " + OX);
    System.out.println("��� : " + OX.size() + "��");
    System.out.println("�ְ� ��� 21��");
  }
}
