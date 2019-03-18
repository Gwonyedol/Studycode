package map;
import java.util.Random;
import java.util.Scanner;

//���赵
//Lotto lotto = new Lotto();
//lotto.SelectLottoNumber(); >>�޴�����
//1.�Է� ��ȣ���� >> selectBasicNumber() �Լ� ȣ���..(�ǹ�ȣ �����ϵ���)
//2.���� �Է� >> ȭ�鿡 ���..
//3.���� �Է� >> ���α׷� ����
public class Lotto {
	private Scanner scanner;
	private Random r; //r.nextInt(45)+1 (1~45)
	private int[] numbers;
	
	
	public Lotto() { //Ư���� ����(������ �Լ�):����ʵ� �ʱ�ȭ .. , constructor
		scanner = new Scanner(System.in); //�ʱ�ȭ�� �ǹ� : �������� �ּҰ��� ���°�
		r = new Random();
		numbers = new int[6];
	}
	
	
	public void displayMenu() {
		System.out.println("---------------------------------");
		System.out.println("--------- �� Lotto Program �� ---------");
		System.out.println("---------------------------------");
		System.out.println("1.�ζ� ��ȣ ����");
		System.out.println("");
		System.out.println("2.�ߺ��� ���� �ζ� ��ȣ ����");
		System.out.println("");
		System.out.println("3.��������(3)�ڵ�����(3)");
		System.out.println("");
		System.out.println("4.3�ǹ���� ������ �ζǹ�ȣ");
		System.out.println("");
		System.out.println("5.�ý��� ����");
		System.out.println("---------------------------------");
		
	
		int selectnumber = 0;
		
				
		
		a: while(true) {
			System.out.print("�޴� ���� : ");
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
				System.out.println("�޴��� �߸� ���̳׿�");
				
			
			}
		}
		

		
	}
	
	
	
	
		
	public void lottoPick1() { //�ζ� ����

		System.out.print("�ζ� ��ȣ : ");
		for(int i = 0; i < numbers.length; i++) {
			int a = (int)(Math.random()*45+1);
			numbers[i] = a;	
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	public void lottoPick2() { //�ߺ��� ���� �ζ� ����

		System.out.print("�ߺ��� ���� �ζ� ��ȣ : ");
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
		
		System.out.println("���� ���� 3���� �Է��ϼ���");
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
	
	public void lottoPick4() { // 3�� ����� ������ �ζǹ�ȣ

		System.out.println("3�� ��� �ζǹ�ȣ : ");
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
	
	public void lottoPick5() { // �������� ��ȣ ����
		System.out.print("�ý��� ����");
		System.exit(0);

	}
}
