import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	public static void main(String[] args) {
		
		try {
				copyFiles();
				startInstall();
				
				//�������� ���Ƿ� [���ܸ� ����] �Ҽ� �ִ�
				//A, B , C �����Է� ,,,, D��� �Է� (������)
				//����� ���� ������ (���� ��ü�� ������ ���� ���� (new )
				throw new IOException("Install ó�� �� ���� �߻�");
		
		}catch(Exception e) {
			System.out.println("���� �޽��� ��� : " + e.getMessage());
		}finally { //���ܰ� �߻� , �߻� ���� �ʴ� ������ ���� �ҷ�
			fileDelete();
		}
		//���ǻ��� ....
		//******* �Լ� ����(return) �ִ� �ϴ��� finally ���� ������
		//�� ���� �����ϰ� �Լ� ���� ......*********
		System.out.println("MAIN END");
		
		
		

	}

}
