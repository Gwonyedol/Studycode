package HomeWork;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
 
public class Quiz_Lotto {
    private Scanner scanner; // ��ǰ���� �������� , ��ǰ���� , ��������
    private int lottoCount;
    private int nameCount;
    
    public Quiz_Lotto() { // Ư���� ���� : member field �ʱ�ȭ (������ �Լ�) , constructor
        scanner = new Scanner(System.in); // �ʱ�ȭ (���� ���� �ּҰ��� ���°�)
        lottoCount=0;
        nameCount=0;
    }
    
    public void show_MainMenu() { // ù �޴� ���
 
        do {
                System.out.println("\n***�ζ� ���α׷�***\n");
                System.out.println("1. �ζ� �귿 ������");
                System.out.println("2. �ζ� ȸ������ ����");
 
                System.out.println("3. �ý��� ����");
                
                System.out.print("\n�޴� ���� : ");
                int menu = Integer.parseInt(scanner.nextLine());
                switch (menu) {
                case 1:
                     // �ϴ� �ѹ� �ζǹ�ȣ ���
                    show_PrintMenu(selectBasicLottoNumber());
                    break;
                case 2:
                    lottoLogPreview();
                    break;
                case 3:
                    System.out.println("�ʰ� ���� ������?");
                    System.exit(0);;
                default:
                    System.out.println("�ٺ�");
            } 
        } while (true);
 
    }
 
    private List selectBasicLottoNumber() { //��ȣ ���� �� ī����/ ����Ʈ ����
        Set<Integer> hashset = new HashSet<Integer>();
        for (int i = 0; hashset.size() < 6; i++) {
            hashset.add((int) (Math.random() * 45 + 1));
        }
        List<Integer> list = new ArrayList<Integer>(hashset);
        Collections.sort(list);
        System.out.println(list +"\n");
        this.lottoCount++;
        lottoLog(list);
        return list;
    }
    
    private void show_PrintMenu(List list) {
        do {
                System.out.println("\n***�ΰ� ���***\n");
                System.out.println("1. ��������(txt)");
                System.out.println("2. �ζ� ��ȣ ȸ���� ����");
                System.out.println("3. �ý��� ����");
                System.out.print("\n�޴� ���� : ");
                int menu = Integer.parseInt(scanner.nextLine());
                switch (menu) {
                case 1:
                    txtWrite(list); 
                    break;
                case 2:
                    lottoLogPreview();
                    break;                    
                case 3:
                    System.out.println("�ʰ� ���� ������?");
                    System.exit(0);;
                default:
                    System.out.println("�ٺ�");
            }
        }while(false);
    }
    
    private void lottoLog(List list) {
        String date = DateString(Calendar.getInstance(), "-"); 
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;
        File file = null;
        
        String path = "./temp";
        file = new File(path);
        if(!file.exists()) {
            file.mkdir();
        }
        file = new File(path+"/lottoLog.txt");
        try {
            filewriter = new FileWriter(file, true);
            bufferedwriter = new BufferedWriter(filewriter);
            bufferedwriter.write(date + " ");
            bufferedwriter.write(lottoCount + "times ");
            bufferedwriter.write(list.toString()+ " ");
            bufferedwriter.write(System.getProperty("user.name")+"\n");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedwriter.flush();
                bufferedwriter.close();
                filewriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void txtWrite(List list) {
        FileWriter filewriter = null;
        BufferedWriter bufferedwriter = null;
        File file = null;
        String path = "./lottoLog.txt";
        file = new File(path);
        if(file.exists()) {
            file = new File("./"+lottoCount+"times lottoLog("+this.nameCount+").txt");
            this.nameCount++;
        }
        
        try {
            filewriter = new FileWriter(file,true);
            bufferedwriter = new BufferedWriter(filewriter);
            bufferedwriter.write(lottoCount + "ȸ�� ");
            bufferedwriter.write(list.toString()+"\n");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bufferedwriter.flush();
                bufferedwriter.close();
                filewriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    private void lottoLogPreview() {
        String log = "�����Ͱ� �����ϴ�.";
        
        FileInputStream fileinputstream = null;
        DataInputStream datainputstream = null;
        
        try {
            fileinputstream = new FileInputStream("./temp/lottoLog.txt");
            datainputstream = new DataInputStream(fileinputstream);
            while((log = datainputstream.readLine())!=null) {
                System.out.println(log);
            }
        } catch (Exception e) {
            System.out.println(log);
        }finally {
            try {
                datainputstream.close();
                fileinputstream.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
    }
    
    public static String DateString(Calendar date, String opr) {
        return date.get(Calendar.YEAR) + opr + (date.get(Calendar.MONTH) + 1) + opr 
                + date.get(Calendar.DATE) + opr + date.get(Calendar.HOUR)+ ":" + date.get(Calendar.MINUTE)
                + ":" + date.get(Calendar.SECOND);
    }
    
}
