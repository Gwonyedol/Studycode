package map;

class Apple {
	public String toString() {
		return "���!!!!";
	}
}

class Orange {
	public String toString(){
		return "������!!!!";
	}
}

class Box {
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	public Object get() {
		return ob;
	}
}


public class FruitBox {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.set(new Apple());
		
		System.out.println((Apple)box1.get());
		
		
		Box box2 = new Box();
		

	}

}
