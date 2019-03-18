package map;
import java.util.Random;
import java.util.Scanner;

//설계도
//Lotto lotto = new Lotto();
//lotto.SelectLottoNumber(); >>메뉴제공
//1.입력 번호추출 >> selectBasicNumber() 함수 호출시..(실번호 추출하도록)
//2.값을 입력 >> 화면에 출력..
//3.값을 입력 >> 프로그램 종료
public class Lotto {
	private Scanner scanner;
	private Random r; //r.nextInt(45)+1 (1~45)
	private int[] numbers;
	
	
	public Lotto() { //특수한 목적(생성자 함수):멤버필드 초기화 .. , constructor
		scanner = new Scanner(System.in); //초기화의 의미 : 참조변수 주소값을 갖는것
		r = new Random();
		numbers = new int[6];
	}
	
	
	public void displayMenu() {
		System.out.println("---------------------------------");
		System.out.println("--------- ☆ Lotto Program ☆ ---------");
		System.out.println("---------------------------------");
		System.out.println("1.로또 번호 추출");
		System.out.println("");
		System.out.println("2.중복값 배제 로또 번호 추출");
		System.out.println("");
		System.out.println("3.수동선택(3)자동선택(3)");
		System.out.println("");
		System.out.println("4.3의배수만 나오는 로또번호");
		System.out.println("");
		System.out.println("5.시스템 종료");
		System.out.println("---------------------------------");
		
	
		int selectnumber = 0;
		
				
		
		a: while(true) {
			System.out.print("메뉴 선택 : ");
			selectnumber = Integer.parseInt(scanner.nextLine());
			switch(selectnumber) {
			case 1:
				lottoPick1();
				break ;
			case 2:
				lottoPick2();
				break ;
			case 3:
				lottoPick3();
				break ;
			case 4:
				lottoPick4();
				break ;
			case 5:
				lottoPick5();
				break ;			
			default:
				System.out.println("메뉴를 잘못 고르셨네요");
				
			
			}
		}
		

		
	}
	
	
	
	
		
	public void lottoPick1() { //로또 선택

		System.out.print("로또 번호 : ");
		for(int i = 0; i < numbers.length; i++) {
			int a = (int)(Math.random()*45+1);
			numbers[i] = a;	
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	public void lottoPick2() { //중복값 배제 로또 선택

		System.out.print("중복값 배제 로또 번호 : ");
		for (int i = 0; i < numbers.length; i++) {
			int a = (int) (Math.random() * 45 + 1);
			numbers[i] = a;
			for (int j = 1; j <= i; j++) {
				int b = numbers[i-j];
				if (a == b) {
					int c = (int) (Math.random() * 45 + 1);
					numbers[i] = c;					
					break;						
				}					
			}
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	/*
	         for(int i =0; i<number.lengh;i++) { 
             numbers[i] = r.nextInt(45) +1;
           for(int j=0;j<i;j++) {
               if(numbers[i] == numbers[j]) {
                  i--;
                 break; 
               }           
           }
	 */
	
	public void lottoPick3() { 
		
		System.out.println("수동 숫자 3개를 입력하세요");
		String[] hi = new String[3];		
		for(int a = 0; a < 3 ; a ++ ) {
			hi[a] = scanner.nextLine();	

		}
		
		for(int a = 0; a < 3 ; a ++ ) {
			System.out.print(hi[a]+" ");
		}

		int[] numbers2 = new int[3];
		for(int j =0 ; j < 3 ; j ++) {
			numbers2[j]=(int)(Math.random()*45+1);		
			System.out.print(numbers2[j]+" ");	
		}
		System.out.println(" ");
	}
	
	public void lottoPick4() { // 3의 배수만 뽑히는 로또번호

		System.out.println("3의 배수 로또번호 : ");
		for(int i =0 ; i<numbers.length; i++) {
			numbers[i] = (int)(Math.random()*45+1);
			if(numbers[i] % 3 == 0) { 
				System.out.print(numbers[i]+" ");;
			} else {
			i--;
			}

		}
		System.out.println(" ");


	}
	
	public void lottoPick5() { // 오름차순 번호 선택
		System.out.print("시스템 종료");
		System.exit(0);

	}
}
