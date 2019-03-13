import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class QuizProgram {
    HashMap<String, String> quizList;
    int score;
    Set<String> quizSet;
    Iterator<String> i;
    Scanner sc;
    int quizNumber;
    
    QuizProgram() {
        sc = new Scanner(System.in);
        score = 0;
        quizNumber = 1;
        quizList = new HashMap<String, String>();
        
        quizList.put("����������������", "������̵彺����");
        quizList.put("����������", "��ũ����Ʈ");
        quizList.put("������", "���׶�");
        quizList.put("������������", "���ǻƼ��");
        quizList.put("������������������", "�̻��ѳ����Ǿٸ���");
        quizList.put("��������", "�����̾�");
        quizSet = quizList.keySet();
        i = quizSet.iterator();
    }
    
    void quizGame() {
        while (i.hasNext()) {
            System.out.println("��ȭ ���� �ʼ� ����");
            String quiz = i.next();
            String answer = printQuiz(quiz);
            if (checkAnswer(quiz, answer)) {
                System.out.println("�����Դϴ�!");
                System.out.println();
                score++;
            } else {
                System.out.println("��!");
                System.out.println("������ " + quizList.get(quiz) + "�Դϴ�.");
                System.out.println();
            }
        }
        System.out.println("���� ������ �������ϴ�.");
        System.out.println("������ " + score + "���Դϴ�.");
    }
    
    String printQuiz(String quiz) {
        System.out.println(quizNumber + "�� ����");
        System.out.println(quiz);
        
        System.out.print("��: ");
        String answer = sc.nextLine();
        return answer;
    }
    
    boolean checkAnswer(String quiz, String answer) {
        quizNumber++;
        return quizList.get(quiz).equals(answer); 
    }
}