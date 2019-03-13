/*
객체 지향 언어 특징
상속 , 캡슐화 , 다형성 ...

캡슐화 (은닉화) -> private 

[method overloading]
[하나의 이름]으로 [여러가지 기능]을 하는 함수
사용 : System.out.println()  대표적인 예
특징 : 오버로딩 성능향상에 도움을 주지 않는다
      Why) 편하게 살려고(사용) >> 개발자
      설계시 어떤 점을 고려 : 함수의 활용이 많은 경우

문법 : 함수의 이름은 같고 parameter 의 [개수]와 [타입]을 달리하는 방법
1. 함수의 이름은 같아야 한다
2. [parameter] 개수 또는 [Type]은 달라야 한다
3. return Type overloading 판단기준이 아니다
4. parameter 순서가 다름을 인정 ......

*/

class Human{
	String name;
	int age;
}

class OverTest{
	Human hh = new Human();
	void add(Human h) { //class == Type
		h.name = "홍길동";
		h.age  =100;
		System.out.println(h);
	}
	
	
	int add(int i) {
		return 100 + i;
	}
	
	String add(String s) {
		return "hello" + s;
	}
	
	//void add(int k) {} 안되요 (parameter type 충돌)
	int add(int i , int j) {
		return i + j;
	}
	
	void add(int i , String s) {
		System.out.println("오버로딩");
	}
	
	void add(String s , int i) { //순서가 다름을 인정 합니다
		System.out.println("순서 인정 : overloading");
	}
	
	//배열(Array) 배윘으니
	//초초중급 ....
	//int[] source = {10,20,30,40,50};
	int[] add (int[] param) { //parameter 로 int 배열의 주소값을 받겠다
		int[] target = new int[param.length];
		for(int i = 0 ; i < param.length ; i++) {
			target[i] = param[i]+1;
		}
		return target; //int 타입의 배열의 주소값을 return
	}
	
	int[] add(int[] so , int[] so2) {
		//마음대로 코드 작성 (error 만 없으면 됩니다)
		int length = so.length > so2.length ? so.length : so2.length;
		int[] result = new int[length];
		for(int i = 0 ; i < so2.length ; i++) {
			result[i] = so2[i]; 
		}
		return result;
	}
	
	Human[] add(Human[] human) {
		//......
		Human[] h = new Human[human.length];
		//......
		return h;
	}
	
}


public class Ex11_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(100);
		System.out.println("HELLO");
		
		OverTest ot = new OverTest();
		System.out.println(ot.add(100));
		//ot.add(3.1f);  //add(float f) 존재(x)
		
		ot.add(100,"H");
		
		Human human = new Human();
		ot.add(human);
		System.out.println(human.name);
		System.out.println(human.age);
		
		ot.add(new Human());
		*/
		OverTest ot = new OverTest();
		//int 타입의 배열의 주소를 주어야 ....
		int[] source = {10,20,30,40,50};
		System.out.println(source);
	    int[] target = ot.add(source); //I@15db9742 주소값
	    for(int i = 0 ; i < target.length ; i++) {
	    	System.out.println(target[i]);
	    }
	    
	    
	    //int[] add(int[] so , int[] so2) 실행시 error 없으면 되요
	    int[] so = {10,20,30,40,50};
	    int[] ta = {100,200,300};
	    int[] ta2 = ot.add(so,ta);
	    System.out.println();
	    for(int value : ta2) {
	    	System.out.println(value);
	    }
	    
	}

}








