import java.util.ArrayList;

//Today Point
//generic
//JDK1.5 ���� ����
//C# , JAVA �ʼ� ���

//1. Object Ÿ�� ���� -> Object  Ÿ�� Ż��
//2. Ÿ���� �����ϴ� ���(Ÿ�� ������)
//3. ����ȯ (castring) ���� �ذ� :   (Car)obj downcasting ���� �ʰڴ�...

class Person{
	int age = 100;
}

class MyGen<E>{ //Type parameter MyGen<E>
	E obj;
	
	void add(E obj) {
		this.obj = obj;
	}
	
	E get() {
		return this.obj;
	}
}
/*
MyGen<String> mygen = new MyGen<String>();

heap �޸𸮿� �ε� �ɶ�

class MyGen{ //Type parameter MyGen<E>
	String obj;
	
	void add(String obj) {
		this.obj = obj;
	}
	
	String get() {
		return this.obj;
	}
}

MyGen<Car> mygen = new MyGen<Car>();

class MyGen<Car>{ //Type parameter MyGen<E>
	Car obj;
	
	void add(Car obj) {
		this.obj = obj;
	}
	
	Car get() {
		return this.obj;
	}
}
*/
public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("AAA");
		System.out.println(mygen.get());
		
		MyGen<Person> mygen2 = new MyGen<Person>();
		mygen2.add(new Person());
		Person p = mygen2.get();
		System.out.println(p.age);
			
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		for(String str : li) {
			System.out.println(str);
		}
		
		////////////////////////////////////////
		ArrayList list= new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("ȫ�浿");
		
		//������ for���� ����ؼ� >> 500 , 100 , ȫ�浿 ��µǰ� �ϼ���
		for(Object obj : list) {
			//System.out.println(obj);
			if(obj instanceof Person) {
				Person person = (Person)obj;
				System.out.println(person.age);
			}else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person());
		System.out.println(alist.get(0).age);
	}

}




