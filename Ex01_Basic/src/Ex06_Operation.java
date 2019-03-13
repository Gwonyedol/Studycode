//연산자
public class Ex06_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result); //나머지
		
		//증가감 연산자 (++ , --) 1씩 증가 , 1씩 감소
		int i = 10;
		++i; //전치 증가 
		System.out.println(i);
		i++; //후치 증가
		System.out.println(i);
		//변수 1개 : 전치, 후치 동일
		
		//POINT : 전치와 후치 연산자는 결합하면 본질을 ....
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2; //j2 1증가 시키고  + 연산
		System.out.println(result2); 
		//i2 > 5 , j2 > 5  , result2 > 10
		result2 = i2 + j2++;
		//i2 > 5 , j2 > 6 , result2 > 10
		System.out.println(result2);
		System.out.println(j2);
		
		//POINT
		//자바의 연산 규칙
		//정수의 모든 [연산]은 int 변환 후 처리
		//byte + byte => 컴파일러는 int + int 인지 
		byte b =100; //-128 ~ 127
		byte c = 1;
		byte d = (byte)(b + c); //일단 101 숫자가 1byte 표현 ....
		//1. byte d = (byte)(b + c); 쓰레기값이 발생 가능
        //2. int d = b + c; 사실은 이 놈이 정답
		System.out.println("d : " + d);
		
		//byte + short => int + int
		//char + char  => int + int
		//POINT : 연산에 int 보다 작은 타입은 int 형 변환(long제외)
		//byte , char , short => int 바꾸어서 연산 처리
		
		//byte + short => int + int >> 결과 int
		//char + int   => int + int >> 결과 int
		//int + long   => long + long >> 결과 long
		
		//정수와 실수 >> 실수
		//float + int => float + float >> 결과 float
		//long + float => float + float >> 결과 float
		//float + double => double + double >> 결과 double
		
		float num2 = 10.45f;
		int num3 = 20;
		// result =num2 + num3
		//int result5 = (int)(num2 + num3);
		//System.out.println(result5);
		
		float result5 = num2 + num3;
		System.out.println(result5);
		
		//char 는 정수 타입 
		char c2 = '!'; //33
		char c3 = '!'; //33
		//result6 =  c2 + c3; //!!(x)
		//char result6 = c2+c3;   int =  int + int
		int result6 = c2+c3;
		System.out.println(result6);
		System.out.println((char)result6);
		
		//제어문
		//중소기업 시험문제 (구구단) => 별찍기
		
		//1~100 까지 짝수의 합 ...
		int sum = 0;
		for(int j = 1 ; j <= 100 ; j++) {
			//System.out.println(j);
		    if(j%2 == 0) {
		    	sum+=j;
		    }
			//sum = sum + j;
		}
		System.out.println("sum :" + sum);
		
		//== 연산자 (값(value) 비교하는 연산자)
        //javascript (===)		
		if(10==10.0f) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		//! 부정연산자
		if('A' != 65) { //같지 않니
			System.out.println("어 같은 값이 아니야");
		}else {
			System.out.println("어 같은 값이야");
		}
		
		//암기하자(POINT)
		//제어문처럼 쓰는 연산자(삼항연산자)
		int p = 10;
		int k = -10;
		int result8 = (p==k)? p : k;
		//? 앞에있는 조건식이 true 라면  : 앞에 있는 값을
		//? 앞에있는 조건식이 false라면  : 뒤에 있는 값을
		System.out.println("result8:" + result8);
		//위 삼항 연산자를 if 문 바꾸어 보세요
		if(p == k) {
			result8 =p;
		}else {
			result8 = k;
		}
		
		/*
		진리표
		0: false
		1: true
		      OR       AND 
		0 0   0         0
		0 1   1         0
		1 0   1         0 
		1 1   1         1
		
		sql(oracle)
		select *
		from emp
		where job='sales' and sal > 2000; 
		  
		select *
		from emp
		where job='sales' or sal > 2000;   
		  
		*/
		
		
		
		//연산자 ( | (or) , & (and) )
		//0 과 1 의 bit 연산
		int x =3;
		int y =5;
		System.out.println("x|y : " + (x|y));
		//십진수 3을 -> 2진수값으로 변환
		// 128 64 32 16 8 4 2 1   
		//              0 0 1 1  (2진수 : 3)
		//              0 1 0 1  (2진수 : 5)
		//OR            0 1 1 1 > 1+2+4 > 7 
		//AND           0 0 0 1 > 1 > 1
		
		System.out.println("x&y : " + (x&y));
	}

}
