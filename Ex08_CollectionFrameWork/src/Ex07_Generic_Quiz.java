import java.util.ArrayList;
import java.util.List;

class Product{}

class Tv extends Product{
	@Override
	public String toString() {
		return "Tv";
	}
}

class Audio extends Product{
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	@Override
	public String toString() {
		return "NoteBook";
	}
}
public class Ex07_Generic_Quiz {
	public static void main(String[] args) {
		//1. Array(배열) 사용해서 cart 만들고 제품 3개를 담으세요
		Product[] cart = new Product[3]; //다형성
		cart[0] = new Tv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		
		//2. ArrayList 를 사용해서 cart 만들고 제품 3개를 담으세요
		List<Product> product = new ArrayList<Product>(); //***************
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Tv());
		product.add(new Audio());
		product.add(new Tv());
		product.add(new NoteBook());
		
		for(Product pro : product) {
			System.out.println(pro.toString());
		}
		
	}

}


