package kr.or.bit;
import java.util.Random;
import java.util.Scanner;

public class Lotto_Teacher {
    private Scanner scanner;
    private Random r; // r.nextInt(45)+1 (1~45)
    private int[] numbers;
    private static final int no = 3; // 수동입력 갯수
 
    // static{} , {} 초기자
    public Lotto_Teacher() { // 특수한 목적:member field 초기화 :(생성자 함수) , constructor
        scanner = new Scanner(System.in); // 초기화 (참조 변수 주소값을 갖는것)
        r = new Random();
        numbers = new int[6];
    }
 
    // 기능을 구현해보세요 (함수)
    // 함수하나당 기능 하나
 
    private String showMenu(Scanner scanner) {
        System.out.println("*********************");
        System.out.println("1. 당첨 예상 번호 추출:");
        System.out.println("2. 종료.^^!");
        System.out.println("*********************");
        System.out.print("당신이 원하는 번호를 선택:");
        String selectionnum = scanner.nextLine();
        return selectionnum;
    }
 
    private void pickingNumber(Scanner scanner, int[] numbers, int no) {
        int i = 0;
        while (i <= no - 1) {
            System.out.println(i + 1 + "번째 숫자를 입력하세요");
            numbers[i] = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < i; j++) { // 이전값과는 전체 비교를 해야 함
                if (numbers[i] == numbers[j]) {
                    System.out.println("같은 값을 입력했습니다. 다시 입력하세요");
                    i--; // point
                    break;
                }
            }
            i++;
        }
    }
 
    public void selectLottoNumber() {
        // 메뉴 설정....
        escape: while (true) {
            String selectionnum = showMenu(scanner);
            switch (selectionnum) {
            case "1":
                pickingNumber(scanner, numbers, no); // 3개의 값을 입력
                selectBasicLottoNumber(r, numbers, no); // 추출
                showLottoNumbers(numbers); // 화면 출력
                break;
            case "2":
                System.out.println("Good Lucky");
                break escape; // escape 지점으로 탈출..
            default:
                System.out.println("Not Operation");
                break;
            }
        }
 
    }
 
    private void selectBasicLottoNumber(Random r, int[] numbers, int no) {
        // 실로또 번호 추출하고 중복값 배제 처리 하는 함수
        for (int i = no; i < 6; i++) { // 3개만 random 생성
            numbers[i] = r.nextInt(45) + 1; // 난수 추출
            for (int j = 0; j < i; j++) { // 이전값과는 전체 비교를 해야 함
                if (numbers[i] == numbers[j]) {
                    i--; // point
                    break;
                }
            }
        }
    }
 
    private void showLottoNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("[%2d]", numbers[i]);
        }
        System.out.println();
    }
 
    // 검증(기능 함수) (6개의 합을 구해서 6으로 나눈 평균의 범위가 5보다 크거나 같고
    // 10보다 작거나 같으면 번호 추출
    // (avg >= 5 && avg <= 10) true 리턴 ... 이 범위가 아니면 재추출하겠다
    private boolean checkAverage(int[] numbers) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        return (average >= 5 && average <= 10); // 5,6,7,8,9,10 >> true
 
    }
 
}

