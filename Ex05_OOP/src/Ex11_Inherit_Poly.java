//��Ӱ��迡�� ������

class Pbase{
	int p = 100;
}

class Cbase extends Pbase{ 
	int c = 200;
}
class Dbase extends Pbase{
	
}
//Cbase Ŭ���� �ϰ� Dbase Ŭ������ ���� �θ��̴�


public class Ex11_Inherit_Poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//������ : �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ� (�� ��Ӱ���)
		//�׷����� �޸𸮿� ��� �ڿ��� �����ϴ� ���� �ƴϰ� �ڽ�(�θ�) Ÿ�Ը� ���ٰ���
		Pbase p = c; //������
		System.out.println("p �θ�Ÿ�� ���� :" + p);
		System.out.println("p ����� c Ÿ�� ���� :" + c);
		
		System.out.println(c.c +" / " + c.p);
		System.out.println("�ڽ��� �͸�(�θ�Ÿ��):" + p.p);
		
		Dbase d = new Dbase();
		p = d; //P��� �θ�Ÿ�� ������ d ���ּҵ� ������ , c �ּҵ� ���� �� �ִ�
        //c , d �� ���� �θ� ....
		
		///////////////////////////////////
		Dbase dd = (Dbase)p; //�θ�� (����Ÿ��) => ����Ÿ���� �ڽĿ��� ...
		//�θ�Ÿ���� �ּҰ��� �ڽ�Ÿ�Կ��� ����(���� -> ����)
		//�ݵ�� ����Ÿ�Կ� �´� ĳ���� ....
	}

}
