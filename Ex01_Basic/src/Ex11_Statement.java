import java.util.Scanner;

//반복문(while, do~while)
public class Ex11_Statement {
	public static void main(String[] args) {
		//while(true) {
		//	System.out.println("True");
		//}
		
		int i = 10;
		while(i >= 10) { //조건 true
			System.out.println(i);
			//반드시 내부에서 명시적인 증가감
			i--;
			
		}

		//1~100까지의 합
		int sum=0;
		int j = 1;
		while(j <= 100) {
			//j++;  //주의 ^^  5150
			sum+=j;
			j++;  //5050
		}
		System.out.println("1~100까지합 : " + sum); //
		
		//while 문으로 구구단 (처음 하시는 분 : for)
		int k = 2;
		int p = 1;
		while(k <= 9) {
			p = 1; //p값을 10에서 1로 ....
			while(p <= 9) {
				System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
				p++;
			}
			System.out.println();
			k++;
		}
		
		//do ~ while() : 강제적 실행 (무조건 한번 실행 그 이후 조건 판단)
		//do { 실행문 } while(조건식)
		//메뉴 구성
		//1. 인사
		//2. 급여
		//1입력하면 인사 ... 2 입력하면 급여 ... 3번 입력 다시입력해 강제
		Scanner sc = new Scanner(System.in);
		int inputdata =0;
		do {
			System.out.println("숫자 입력해(0~10)");
			inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata > 10); //while true 계속 반복
		//while 문 탈출은 조건이 false 일때 while 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
	}

}
