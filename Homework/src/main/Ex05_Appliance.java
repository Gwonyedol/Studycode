package main;

class Product {
	int price;
	int pointnumber;

	public Product(int price) {
		this.price = price;
		this.pointnumber = (int) (price / 10.0);
	}
}

class Tv extends Product {
	public Tv() {
		super(5000);
	}

	public String toString() {
		return "Tv";
	}

}

class Audio extends Product {
	public Audio() {
		super(1000);
	}

	public String toString() {
		return "Audio";
	}

}

class NoteBook extends Product {
	public NoteBook() {
		super(3500);
	}

	public String toString() {
		return "NoteBook";
	}

}

class Buyer {
	int pay = 100000;
	int bpointnumber;

	public void buy(Product n) {
		if (n.price > pay) {
			System.out.println("돈이 없으시네요!");
			return;
		}
		this.pay = pay - n.price;
		bpointnumber += n.pointnumber;
		System.out.println("구매한 가전제품 : "+n.toString());
		System.out.println("잔돈 : " + this.pay);
		System.out.println("포인트 : " + this.bpointnumber);
	}
}

public class Ex05_Appliance {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();

		Buyer buyer = new Buyer();

		buyer.buy(tv);
		buyer.buy(audio);
		buyer.buy(notebook);

	}
}
