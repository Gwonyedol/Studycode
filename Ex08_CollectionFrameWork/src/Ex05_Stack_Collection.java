import java.util.Stack;

import kr.or.bit.Coin;
import kr.or.bit.MyStack;

public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		//LIFO
		//Stack : Collection Framework 제공하는 클래스
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//java.util.EmptyStackException 발생
		System.out.println(stack.isEmpty()); //true 아무것도 없어
		
		//동전 케이스 
		//stack 자료구조 원하는 형태 ....
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(50));
		coinbox.push(new Coin(500));
		
		//System.out.println(coinbox.pop().getValue());
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동던 :" + coin.getValue() + "원");
		}
		
		////////////////////////////////////
		//내가 만든 stack
		
		MyStack my = new MyStack(3);
		//System.out.println(my.pop());
		my.push("A");
		my.push("B");
		my.push("C");
		my.push("D"); //스택이 가득차 있어요
		
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
	
		//자료구조 
		//최소한 stack 하고 queue 정도의 코드는 구현해 보자 
	}

}






