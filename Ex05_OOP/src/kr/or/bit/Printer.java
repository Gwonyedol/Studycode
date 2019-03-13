package kr.or.bit;

public class Printer {
	private static Printer printer = null;
	private Printer() {}
	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
		}
		return printer;
	}
	public void print(String content) {
		//자원 //프린트
		System.out.println(content);
	}
}
