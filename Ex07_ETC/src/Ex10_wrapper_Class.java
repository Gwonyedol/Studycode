import java.util.ArrayList;

/*
기본타입 (8가지) : 값타입 : JAVA API
8가지 기본 타입에 대해서 [객체 형태]로 사용 가능하도록 만든  클래스 ....
ex) void run(Integer i)

*기본형 타입도  떄로는 객체형태로 다루어져야 하는 경우가 있다
1. 매개변수로 객체타입 요구 될때
2. 기본형 값이 아닌 객체타입로 저장되어야 할때
3. 객체간의 비교가 필요할떄
4. wrapper 클래스는 (타입정보 : 최소크기 , 최대크기)
 이때 8가지 기본타입에 대한 wrapper 클래스 사용
 

*/



public class Ex10_wrapper_Class {
	public static void main(String[] args) {
	
		
		
		int i =100;
		Integer n = new Integer(500); //Integer (int 타입) wrapper 클래스
		System.out.println("i : " + i);
		System.out.println("주소 (재정의) n : " + n.toString());
	
		//ArrayList<int> li = new ArrayList<int>();
		ArrayList<Integer> li = new ArrayList<Integer>(); //POINT
		li.add(100);
		li.add(200);
		for(int r : li) {
			System.out.println(r);
		}
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		System.out.println(i3 == i4); // == 주소값 비교 false
		
		System.out.println(i3.equals(i4)); //값을 비교
		//equals 를 Integer 클래스 재정의 (값을 비교)
		
		Integer t = new Integer(500); //참조변수
		integerMethod(t);
		intMethod(t);
	}
	
	static void integerMethod(Integer i) {
		System.out.println("Integer param : " + i.toString());
	}

	static void intMethod(int i) {
		System.out.println("int param" + i);
	}
	
}








