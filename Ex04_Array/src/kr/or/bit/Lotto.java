package kr.or.bit;
 
import java.util.Random;
import java.util.Scanner;
 
// ���赵
// Lotto lotto = new Lotto();
// lotto.selectLottoNumber(); >> �޴� ����
// 1 �Է� >> selectBasicNumber() �Լ� ȣ�� (��ȣ ����)
// 2 �Է� >> ��ȣ ���
// 3 �Է� >> ���α׷� ���� // System.exit(0);
 
public class Lotto {
    private Scanner scanner; // ��ǰ
    private Random r; // ��ǰ r.nextInt(45) (0~44)
    private int[] numbers; // ����
    private int[] count;
 
    // static{}, {}
    public Lotto() { // ������ �Լ�(constructor) Ư���� ���� : member field�� �ʱ�ȭ, ���� ���� : new�� ���� heap �޸𸮿� �ø�
                        // ��
        scanner = new Scanner(System.in); // ���� ������ �ʱ�ȭ : �ּҰ��� ������ ��
        r = new Random();
        numbers = new int[6];
        count = new int[45];
    }
 
    private void countNumber() {
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            count[num - 1]++;
        }
    }
    
    private void countPrint() {
        System.out.println("��ȣ : ����Ƚ��");
        for (int i = 0; i < count.length; i++) {
            System.out.printf("%d : %d��\n", i + 1, count[i]);
        }
        for (int i = 0; i< count.length; i++) { // count �ʱ�ȭ
            count[i] = 0;
        }
    }
    
    private void countTimes() {
        System.out.println("���� Ƚ���� �Է����ּ���.");
        int time = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < time; i++ ) {
            selectBasicNumber();
            countNumber();
        }
    }
        
    private int[] selectBasicNumber() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
 
        for (int i = 0; i < numbers.length; i++) {
            int min = numbers[i];
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    index = j;
                }
            }
            numbers[index] = numbers[i];
            numbers[i] = min;
        }
        return numbers;
    }
 
    private void printNumbers() {
        System.out.printf("��ȣ�� [%d, %d, %d, %d, %d, %d]\n", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4],
                numbers[5]);
    }
 
    private void showMenu() {
        System.out.println("/////////////////////");
        System.out.println("////�ζǹ�ȣ ���////");
        System.out.println("1. �ζ� ��ȣ ����");
        System.out.println("2. ������ ��ȣ ���");
        System.out.println("3. ���� �ζ� ����");
        System.out.println("4. ���α׷� ����");
        System.out.println("/////////////////////");
        System.out.println("/////////////////////");
    }
    
    private int menuNumber() {
        int menu;
        
        do {        
            try {
                menu = Integer.parseInt(scanner.nextLine());
                if (menu >= 1 && menu <= 4) {
                    break;
                } else {
                    throw new Exception("����");
                }
            } catch (Exception e) {
                menu = 0;
                break;
            }
        } while (true);
        
        return menu;
    }
 
    public void selectLottoNumber() {
        MenuLoop: while (true) {
            showMenu();
            switch (menuNumber()) {
            case 1:
                selectBasicNumber();
                System.out.println("�ζ� ��ȣ�� �����߽��ϴ�.");
                System.out.println();
                break;
            case 2:
                printNumbers();
                System.out.println();
                break;
            case 3:
                countTimes();
                countPrint();
                break;
            case 4:
                System.out.println("�ζ� ���α׷��� �����մϴ�.");
                break MenuLoop;
            default:
                System.out.println("1���� 4�� ���� �Է����ּ���.");
                System.out.println();
                break;
            }
        }
    }
}
