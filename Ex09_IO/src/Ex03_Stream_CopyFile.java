import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03_Stream_CopyFile {
	public static void main(String[] args) throws Exception {
		String orifile = "C:\\Temp\\1.jpg";
		String targetfile= "copy.jpg";
		//default ��� : C:\FrontAndBackAnd\JAVA\Labs\Ex09_IO
		//��θ� ������� ������ >> ������Ʈ ���� ...
		FileInputStream fis = new FileInputStream(orifile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int data =0;
		while((data = fis.read())!= -1){
			fos.write(data);
		}
		fos.close();
		fis.close();
		System.out.println("�۾� �Ϸ�");
		
	}

}
