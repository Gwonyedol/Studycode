import javax.swing.JOptionPane;

//단어 맞추기(구구단) 등등
//요구사항
//게임을 하는데 시간을 보여주고 싶다
//문제 실행 ... 시간도 같이
public class Ex03_Single_Word_Game {

	public static void main(String[] args) {
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값 : " + inputdata);
		timer();
	}
	static void timer() {
		for(int i= 10 ; i > 0 ; i--) {
			System.out.println("남은시간 : " + i);
			try {
				
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
