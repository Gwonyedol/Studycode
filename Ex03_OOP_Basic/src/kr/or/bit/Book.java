package kr.or.bit;
/*
å�� å�̸��� ������ ������ �ִ�.
å�� ���ǵǸ� �ݵ�� å�� å�� �̸��� ������ ������ �־�� �Ѵ�.
å�� �̸��� ���� ������ Ư�� ����� ���ؼ��� �� �� �ְ� ���ǵ� �� �Ŀ���  ������ �� ����
å�̸��� ���������� ���� ������ ���� �� �ִ� (getter)
 
*/
public class Book {
	private String bookname;
	private int price;
	
	public String getBookname() {
		return bookname;
	}
	public int getPrice() {
		return price;
	}
	//public Book(){}  �ݵ�� .....  å�� �����ɶ� ... �̸� ,, ������ ������
	                   //���������� �ᵵ ���������� .... �䱸���� ....����
	public Book(String n , int p) {
		bookname = n;
		price = p;
	}
	public void bookInfo() {
		System.out.println("å�̸�: " + bookname + " , å����:" +  price );
	}
}
