import kr.or.bit.Book;

/*
  ������ �Լ� (constructor) : �ʱ�ȭ(member field) �Լ�
  1. Ư���� ������ ������ �Լ�(�ʱ�ȭ)
  2. �ʱ�ȭ(instance variable : member field) 

  �Ϲ��Լ��� �ٸ���
  1. �Լ��� �̸��� ����(class �̸���  ����(�ݵ��))
  2. ������ �Լ��� : return type(x) , void(x) : default void
     why: �������� ... �Լ��� ��ü ������ ���ÿ� ȣ�� ... ���� �ѱ� ���� ����
  
  ���� : �����Ǵ� ��ü���� �ٸ� �ʱⰪ�� ������ ������
  
  ������ �Լ� : overloading �� �����ϴ� (param �� ������ Ÿ��)
  
  class Car { int door;  Car(){door = 10;} } 
  ���� : Car c = new Car(); 
       1.Stack c���� > default > null
       2.Heap Car ��ü�� ���� > ���� > �����ȿ� member field �ε� > 
         > ������ �Լ� ȣ�� (�ε��� member field �ʱ�ȭ)
       3.class ������ default �����ڴ� ��������
         (���� ���� �������� �ʾƵ� �����Ϸ��� �˾Ƽ� ����)
  
   TIP) ������ �Լ��� overloading ���� ������ �۽�� .........       
--�������� �ǵ� �ľ�--




*/

class  Car{
	String name;
	//����� ���� �������� �ʾƵ�
	//�����Ϸ��� �����ڰ� �ִٰ� ����
	//Car(){} ����(default)
}

class Car2{
	String name;
	Car2(){ //default constructor(������ �Լ�)
		System.out.println("���� ������ �Լ�");
		System.out.println("before : " + name);
		name = "pony";
		System.out.println("after : " + name);
	}
}

class Car3{
	int number;
	//������� : �ڵ�󿡼� default �����ڴ� �Ϲ������� ����
	Car3(){ }
}

class Car4{
	int door;
	int wheel;
	
	Car4(){
		//default
		System.out.println("default");
	}
	
	Car4(int num){ //overloading
		door = num;
		System.out.println("overloading door :" + door);
	}
	
	Car4(int num , int num2){//overloading
		door = num;
		wheel = num2;
		System.out.println("overloading door : wheel" + door + "," + wheel);
	}
}


class Apt{
	 
	  String color;
	  
	  Apt(String color){
	    this.color = color;
	  } 
	}
//1. class ������ Overloading �����ڰ� �ϳ��� �����Ѵٸ� default �����ڴ�
//   �ڵ� �������� �ʴ´�(�����Ϸ��� �ڵ����� ������ �ʴ´�)

//Why) ������ (���赵)�� ������ �ο� (���� overloading �� ���� ��� �ϰ� ...)
//     

class Apt2{
	 
	  String color;
	  //default ����ϰ� �ʹٸ� (�ݵ�� ����)
	  Apt2(){System.out.println("default");}
	  
	  Apt2(String color){
	    this.color = color;
	  } 
	}
public class Ex13_Constructor_Function {

	public static void main(String[] args) {
		//Car c = new Car();
		//Car2 c2 = new Car2();
		//Car3 c3 = new Car3();
		
		Car4 c4 = new Car4(); //default [ȣ��]�ؼ� ��ü ����
		System.out.println();
		Car4 c5 = new Car4(2); //param 1�� [ȣ��]�ؼ� ��ü ����
		System.out.println();
		Car4 c6 = new Car4(2, 3);//param 2�� [ȣ��]�ؼ� ��ü ����
		
		Apt2 apt2 = new Apt2();
		Apt2 apt3 = new Apt2("gold");
		
		
		Book book = new  Book("ȫ�浿��", 10000);
		book.bookInfo();
		System.out.println(book.getBookname());
		System.out.println(book.getPrice());
		
		Book book2 = new Book("����ġ��", 20000);
		book2.bookInfo();
		System.out.println(book2.getBookname());
		System.out.println(book2.getPrice());
	}

}


//1. class ������ ������ �Լ� �������� ������ ... (default ������ �ڵ� ����)
//ex)  class Tv {String name; }

//2. class ������ overloading ������ �Լ��� �ϳ��� ����...
// ** default ������ ��� �� �� ����** 
// ������ ���� ����
//ex) class Tv{ String name; Tv(String n){name =n} }

//3. class ���� default ,overloading �Ѵ� ���� ...
//�ʿ信 ���� default �� overloading ��� ���� �ȴ�
//ex) class Tv{ String name; Tv(){}  Tv(String n){name =n} }



