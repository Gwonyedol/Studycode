package kr.or.bit;

public class PrintProgram {
	private static final int NUM=5;
	public static void main(String[] args) {
		User[] user = new User[NUM];
		for(int i = 0 ; i < NUM ; i++) {
			user[i] = new User((i+1) + "-user");
			user[i].print();
		}

	}

}
