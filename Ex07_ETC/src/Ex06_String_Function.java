import java.util.StringTokenizer;

//String Ŭ���� (�پ��� �Լ�)
//���߿��� ���� ��� (�츮�� ����� �����ʹ� ��κ� ���ڿ� ������)
public class Ex06_String_Function {
	public static void main(String[] args) {
		String str=""; //���ڿ� �ʱ�ȭ
		
		String[] strarr = {"aaa" , "bbb" , "ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		//String Ŭ���� (�Լ�)
		String ss ="hello";
		String concatstr = ss.concat("world");
		System.out.println(concatstr);
		
		//boolean bo = ss.contains("el");
		boolean bo = ss.contains("ele");
		System.out.println(bo);
		
		String ss2 = "a b c d";//[a][ ][b][ ][c][ ][d]
		System.out.println(ss2.length());
		
		String filename="hello java, world";
		System.out.println(filename.indexOf(","));
		System.out.println(filename.indexOf("java")); //���� ��ġ index
		
		//Ȱ�� : ���峻���� ���� ���ϴ� �ܾ ���� �Ǿ��ִ����� ����
		// 0 ���� ū�� .. �ּ��� �ϳ��� �ܾ� ����
		System.out.println(filename.lastIndexOf("a"));
		System.out.println(filename.lastIndexOf("kglim"));
		//�迭�� ���� ���� >> -1 
		//return -1;
		
		//�ַ� ���� ���� �Լ�
		//length() , indexof() , substring() , replace() , ... split()
		String result = "superman";
		System.out.println(result.substring(0));
		System.out.println(result.substring(5));
		System.out.println(result.substring(0, 0));
		System.out.println(result.substring(0, 1));
		System.out.println(result.substring(1, 1));
		System.out.println(result.substring(2, 3)); //index endIndex - 1
		//The substring begins at the specified beginIndex and extends to the character 
		//at index endIndex - 1
		//Quiz 
		String filename2 = "aaaaa.mpeg"; //���ϸ��� �ٲپ� �� �� �ִ�
		//aaaaa.mpeg  or  ab.hwp 
		//���ϸ� >> ȫ�浿
		//Ȯ���� >> jpg
		//�и��ؼ� ȭ�鿡 ����غ�����
		//������ ��� �Լ��� Ȱ���ϼ��� (����� ���� ���� �ȵǿ�)
		int position = filename2.indexOf(".");
		int position2 = filename2.indexOf(".");
		String file = filename2.substring(0, position);
		String extention = filename2.substring(++position);
		String extention2 = filename2.substring(position2+1, filename2.length());
		System.out.println(file + " , " + extention + " , " + extention2);
		
		//replace
		String s2 = "ABCD";
		String result4 = s2.replace("A","�ȳ�");
		System.out.println(result4);
		
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(3)); //return char
		System.out.println(s2.endsWith("CD"));
		System.out.println(s2.equalsIgnoreCase("aBcD"));
		
		//POINT
		//split
		String s6 = "���۸�,��Ƽ,�����,������,������";
		String[] namearry = s6.split(",");
		for(String s : namearry) {
			System.out.println(s);
		}
		
		String filename3 = "bit.hwp";
		String[] arry = filename3.split("\\."); //���� ǥ�� ���ڿ�
		System.out.println(arry.length);
		for(String s : arry) {
			System.out.println(s); //
		}
		//java , javascript , DB >> ���� ǥ����
		//000-{\d4}-0000
		//000-1111-0000 ���� : true
		//000-11-0000 ���� : false
		
		//���� (����ǥ���� 5 �� ����� ����) ������ 
		//�ַ� ���̾��̴� ��
		//�ֹι�ȣ , �����ȣ , ��ȭ��ȣ , �̸��� , ......
		//���� ���� ������ ��..
		
		String s7 = "a/b,c.d-f";
		StringTokenizer sto = new StringTokenizer(s7,"/,.-");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		//�ͼ��� quiz
		String s8 ="ȫ        ��        ��";
		//���� "ȫ�浿" �������� ����
		System.out.println(s8.replace(" ", ""));
		
		String s9 = "     ȫ�浿       ";
		System.out.println(">"+s9+"<");
		
		System.out.println(">"+s9.trim()+"<");
		
		String s10="    ȫ    ��    ��     ";
		//ȫ�浿
		
		//�ٺ� ...
		String re = s10.trim();
		String re2 = re.replace(" ", "");
		System.out.println(re2);
		
		//�������� �Լ��� ������ ��� (method chain)
		//***************************************
		System.out.println(s10.trim().replace(" ", ""));
		
		//Quiz-1
		int sum=0;
		String[] numarr = {"1","2","3","4","5"};
		//����: �迭�� �ִ� ���ڰ����� ���� sum ������ ��Ƽ� ����ϼ���
		for(String s : numarr) {
			sum+=Integer.parseInt(s);
		}
		System.out.println(sum);
		
		//Quiz-2
		String jumin="123456-1234567";
		//�� �ֹι�ȣ�� ���� ���ϼ���
				 int sum2 = 0;
				 for(int i = 0 ; i < jumin.length() ; i++){
						 String numstr = jumin.substring(i,i+1);
						 if(numstr.equals("-"))continue;
						 sum2+= Integer.parseInt(numstr);
					 }
				  System.out.println("�ֹι�ȣ�� :  " + sum2);

			    //�ֹι�ȣ�� ���� ���ϼ��� _2
		 	    //String jumin2 = jumin.replace("-", "").split(regex);
				   String[] numarr2 = jumin.replace("-", "").split("");
				   int sum3 =0;
				   for(String i : numarr2){
					   sum3 += Integer.parseInt(i);
				   }
				   System.out.println("�ֹι�ȣ��2 : " + sum3);

				
			   //�ֹι�ȣ�� ���� ���ϼ��� _3
				   String jumin4 = jumin.replace("-", "");
				   int sum4 = 0;
				   for(int i = 0; i < jumin4.length() ; i++){
					   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
				   }
				   System.out.println("�ֹι�ȣ��3 : " + sum4);
		
		
	}

}
















