
public class Ex02_Exception {
	public static void main(String[] args) {
		int num =100;
		int result=0;
		//���� ó�� ..
		
		
		try {
			for(int i = 0 ; i < 10 ; i++) {
				result = num/(int)(Math.random()*10); //0~9 ���� ��
				System.out.println("result : " + result + " i :" + i);
			}
		}catch(ArithmeticException e) { // ������ ....
			System.out.println("���꿹�� : " + e.getMessage());
		}catch(Exception e) {
			System.out.println("������ ���ܴ� ���� ó�� ....");
		}
		//�������� catch block ���� ����
		//���� ���ܰ� �׻� ���� (�θ�)
		
		
		System.out.println("MainEnd");

	}

}
