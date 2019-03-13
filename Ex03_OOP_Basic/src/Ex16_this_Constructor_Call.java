//2. this(객체 >> 생성자를 호출하는 this)

//원칙 : 생성자는 객체 생성시 한개만 호출
//예외적으로 this 사용하면 여러개의 생성자 함수를 호출 가능

//this.....
//생성자안에 있는 코드가 반복적으로 사용
//default : this.color = "red";
//overloading : this.color = color;

//할당은 한번 ...
class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){
		//this.color = "red";
		//this.geartype = "auto";
		//this.door = 4;
		
		// new Zcar()
		//     this()
		this("red", "auto", 4); //자기자신을 호출(생성자 함수 호출 가능)
		
		System.out.println("default constructor");
	}
	
	Zcar(String color , String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}
	void print() {
		System.out.println(this.color + ","+this.geartype + ","+ this.door);
	}
}

//자동차 영업 사원 (자동차 판매 기본 옵션 ,옵션B , 옵션C 판매 가능) : default , 기본값 ...
//
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red", 2);
		System.out.println("default constructor");
	}
	
	Zcar2(String color , int door){ //차량의 색상과 문의 개수 선택가능 (옵션 B 가격..)
		this(color,"auto",door);
		System.out.println("overloading constructor param2 개");
	}
	
	Zcar2(String color, String geartype , int door){ //차량의 색상 , 기어, 문 개수 선택
		this.color = color;                          //옵션 C 가격 비싸요
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor param3 개");
	}
	
	void print() {
		System.out.println(this.color + ","+this.geartype + ","+ this.door);
	}
}




public class Ex16_this_Constructor_Call {

	public static void main(String[] args) {
		
		Zcar z = new Zcar(); //기본값
		z.print();
		
		//Zcar z2 = new Zcar("blue","auto",10); //overloading
		//z2.print();
		

		//Zcar2 car = new Zcar2();
		//car.print();
		
		//Zcar2 car = new Zcar2("gold",2);
		//car.print();
		
		Zcar2 car = new Zcar2("pink", "manual", 5);
		car.print();
		
	}

}
