/*
 *1. 1~45������ ������ �߻����� 6���� �迭�� ��������  (ó��...)
 *2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (���� �н�...)
 *3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����   (�ڷᱸ�� ...)
 *4. �� ����� ��� �ִ� �迭�� ����ϼ��� 
 
 ���� ���� .....
 */
public class Ex02_Lotto_Main {
	public static void main(String[] args) {
		int[] lotto = new int[6];
        //��ȣ ���� (�ߺ��� ����)
         for (int i = 0; i < 6; i++) {
                 lotto[i] = (int) (Math.random() * 45 + 1); //���� ����
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        i--; //point
                        break;
                    }
                 }
              }
         
         //�����ϱ�
         for (int i = 0; i < lotto.length; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    if (lotto[i] > lotto[j]) {
                        int temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }
                }
            }
         //����ϱ�
         for(int i = 0 ; i < lotto.length ; i++) {
             System.out.println(lotto[i]);
         }

	}

}
