//������(��Ӱ��迡��)
//������ : �������� ����(����)�� ���� �� �ִ� �ɷ�
//TIP) C# �������ȿ� overloading , override ����

//JAVA : [��Ӱ���]���� �ϳ��� [��������] �� �������� Ÿ���� ���� �� �ִ�
//���⼭ ���ϴ� [��������]�� [����Ÿ��]�� �̾߱� �Ѵ�
//����Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� �ּҸ� ���� �� �ִ�

//Java : �ڽ��� �θ𿡰� ���Ǿ��� �帰�� (���Ǽ���� �ݴ�)

class Tv2{  //�θ� (�Ϲ�ȭ, �߻�ȭ) �����ڿ�
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
}

class CapTv extends Tv2 { //�ڱ⸸�� ������ ��� (��üȭ, Ư��ȭ,...)
	String text;
	String caption() {
		return this.text = "���� �ڸ� ó�� ���Դϴ�...";
	}
}



public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("���� : " + tv.power);
		tv.chUp();
		System.out.println("ä������ :" + tv.ch);
		System.out.println("�ڸ�ó�� :" + tv.caption());
		//��������� ���� ���� �н�
		
		//Tv2 tv2 = new Tv2();
		//heap �޸𸮿� Tv2 Ÿ�� ��ü�� �ε� �Ǿ� �ִ�
		
		//Tv2 tv2 = new Tv2(); �̹� �ִ� ���� �� ���� ????
		
		Tv2 tv2 = tv; //�ڽ�Ÿ���� �ּҸ� �θ�Ÿ�Կ��� .. ���Ǿ��� ..
		//���͸�(�θ�) �͸� ���� ����
		System.out.println("�ּҰ� :" + tv.toString());
		System.out.println("�ּҰ� :" + tv2.toString());
		
		//tv2.ch
		
	}

}




