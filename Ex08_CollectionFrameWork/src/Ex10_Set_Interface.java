import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Set �������̽��� �����ϰ� �ִ� Ŭ����
//Set ����(x) , �ߺ�(x) ������ ������ �ٷ궧 ....
//�����ϴ� Ŭ���� : HashSet , TreeSet
//���� �������� �ʾƿ� (���� ������ �������� �ʾƿ�)
public class Ex10_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		hs.add(55);
		
		System.out.println(hs.toString());
		//1. �ߺ� ������ ó��(POINT)
		boolean bo = hs.add(1); //������ ���� ������ ������ �߰� (x)
		System.out.println(bo); 
		hs.add(2);
		System.out.println(hs.toString());
		
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("b");
		hs2.add("A");
		hs2.add("F");
		hs2.add("c");
		hs2.add("z");
		System.out.println(hs2.toString());
		//������ �������� �ʴ´� (���������� )
		
		//1.�ߺ� ������ ������� �ʾƿ� (�ϻ� ��Ȱ���� �ߺ������� �ȵǿ�)
		String[] obj = {"A","B","A","C","D","B","A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0 ; i < obj.length ; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		//1. 1�� (DB table ���� ... primary key ����)
		//2. �ֹι�ȣ , ID ���� ...
		//3. ����Ʈ �湮�� (IP) �� (�Ϲ湮)
		//4. �ζ� ��ȣ .. 
		
		//Quiz
		//HashSet ����ؼ� 1~45���� ���� 6���� ��������(add)
		//(int)(Math.random()*45) +1 
		Set set = new HashSet(); //������ �θ�Ÿ��
		System.out.println(set.size());
		for(int i = 0 ; set.size() < 6 ; i++ ) { //set.size() < 6 POINT
			int num = (int)(Math.random()*45) +1; 
			set.add(num);
		}
		System.out.println(set.toString());
		/*
		   �ʺ��� �Ʒ� �ڵ� ����
		   for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {   //�ߺ���
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }		
        */
		
		//for(int i = 0 ; set.size() < 6 ; i++ ) >> while ��ȯ�ϼ���
		Set set2 = new HashSet(); //������ �θ�Ÿ��
		System.out.println(set2.size());
		//while Ƚ�� 
		int index =0;
		while(set2.size() < 6) {   //set2.size() < 6
			System.out.println("index:" + (++index));
			int num = (int)(Math.random()*45) +1; 
			set2.add(num);
		}
		System.out.println(set2.toString());
		
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3.toString());
		
		Iterator<String> s = set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		//add �� ������ �������� �ʾƿ� (�迭�� �ƴϿ���)
		
		//Collections.sort(List<T> list); List �������̽��� �����ϴ� ��� ��ü parameter ��
		
		//Set �������̽��� �����ϴ�  HashSet ������ ��ٰ� ... ������ ���� ..�ȵǳ� ...
		//HashSet >> sort ����(x)
		
		List list = new ArrayList(set3);
		System.out.println("before : ������ >>" + list.toString());
		Collections.sort(list);
		System.out.println("after : ���� >>" + list.toString());
		
	}

}


