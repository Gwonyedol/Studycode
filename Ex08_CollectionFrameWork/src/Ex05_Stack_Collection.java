import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		//LIFO
		//Stack : Collection Framework �����ϴ� Ŭ����
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//java.util.EmptyStackException �߻�
		System.out.println(stack.isEmpty()); //true �ƹ��͵� ����
		
		//���� ���̽� 
		//stack �ڷᱸ�� ���ϴ� ���� ....
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		
		//System.out.println(coinbox.pop().getValue());
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("���� ���� :" + coin.getValue() + "��");
		}
		
		////////////////////////////////////
		//���� ���� stack
		
		MyStack my = new MyStack(3);
		//System.out.println(my.pop());
		my.push("A");
		my.push("B");
		my.push("C");
		my.push("D"); //������ ������ �־��
		
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
	
		//�ڷᱸ�� 
		//�ּ��� stack �ϰ� queue ������ �ڵ�� ������ ���� 
	}

}





