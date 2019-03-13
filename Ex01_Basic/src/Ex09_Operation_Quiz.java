import java.util.Scanner;

/*
간단한 사칙 연산기 (+ , - , * , /)
입력값 3개 (입력값은 nextLine() 받아서 필요하다면 숫자 변환)
목적 : Integer.parseInt() ,  equals() 활용
화면
>입력값:100
>입력값(기호): +
>입력값:600
>연산결과 :700

-------------
>입력값:100
>입력값(기호): -
>입력값:100
>연산결과 :0
  
기호받는 건)
String opr = sc.nextLine();
 
hint) if(){} else if(){} 
hint) if(opr == "+"){ 더하기 연산할거야 } (빵점 XXXXXXXX)
Today Point
문자열에 대한 비교는 == 아니고 (equals() 함수를 사용한다
hint) if(opr.equals("+")){ 더하기 연산 }
*/
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		/*
		String str = "+";
		if(str.equals("+")) {
			System.out.println("+");
		}
		
		int i = 100;
		if(i == 100) {
			System.out.println(i);
		}
		*/
		String opr="";//문자열 초기화
	    int input_1=0;
 	    int input_2=0;
  	    int result=0;

	      Scanner sc = new Scanner(System.in);
         
		  System.out.print("숫자입력: ");
		  input_1 = Integer.parseInt(sc.nextLine()); //sc.nextInt()
		 
		  System.out.print("연산기호(+,-,*,/): ");
		  opr = sc.nextLine();

		  System.out.print("숫자입력: ");
		  input_2 = Integer.parseInt(sc.nextLine());

		  if(opr.equals("+")) {
			  result = input_1 + input_2;
		  }else if(opr.equals("-")) {
			  result = input_1 - input_2;
		  }else if(opr.equals("*")) {
			  result = input_1 * input_2;
		  }else if(opr.equals("/")) {
			  result = input_1 / input_2;
		  }else {
			  System.out.println("지원하지 않는 연산자 입니다");
			  //key point (여기서는 main 함수)
			  //return 키워드 :  [함수단위]의 종결자  > main 함수 탈출 > 종료
			  return;
		  }
		  System.out.printf("[%d %s %d = %d]",input_1,opr,input_2,result);
	}

}
