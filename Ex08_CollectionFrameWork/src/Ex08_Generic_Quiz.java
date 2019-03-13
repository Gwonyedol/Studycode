import java.util.ArrayList;
import java.util.Iterator;

import kr.or.bit.CopyEmp;
import kr.or.bit.Emp;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		//1. Emp 클래스를 사용해서 사원 3명을 생성하세요
		//단 ArrayList 제너릭을 사용하세요
		//데이터는 편하신 데로 ....
		ArrayList<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(1000,"김씨","IT"));
		emplist.add(new Emp(2000,"박씨","SALES"));
		emplist.add(new Emp(3000,"이씨","MANAGER"));
		
		//2. 3명의 사원 정보(사번 , 이름 , 직종)을 개선된  for문을 사용해서 출력하세요
		//단 toString() 사용금지
		 for(Emp emp : emplist) {
			 System.out.println(emp.getEmpno()+"/"+
		                        emp.getEname()+"/"+
					 			emp.getJob());
		 }
		
		//3. 3명의 사원 정보(사번 , 이름 , 직종)을 개선된  일반for문을 사용해서 출력하세요
		//단 toString() 사용금지
		 for(int i = 0 ; i < emplist.size() ; i++) {
				System.out.println(emplist.get(i).getEmpno() +"/"+
								   emplist.get(i).getEname() +"/"+
						           emplist.get(i).getJob());
			}
		
		//4. CopyEmp 라는 클래스를 만드세요 (구조는 Emp 와 같은데)
		//job member field 대신에 
		//private int sal 추가하고  (getter , setter 구현)
		//ArrayList 제너릭 사용해서 사원 3명 만드세요
		//아래 데이터
		//100 , "김" , 1000
		//200 , "이" , 2000
		//300 , "박" , 3000
		 ArrayList<CopyEmp> clist = new ArrayList<CopyEmp>();
		 	clist.add(new CopyEmp(100,"김",1000));
			clist.add(new CopyEmp(200,"이",2000));
			clist.add(new CopyEmp(300,"박",3000));
		//5.200번 사원의 급여를 5000으로 수정해서 출력하세요 (일반 for문 사용하세요)
		for(int i = 0 ; i < clist.size() ; i++) {
			if(clist.get(i).getEmpno() == 200) {
				clist.get(i).setSal(5000);
				System.out.println(clist.get(i).toString());
			}
		}
		
		//6.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)
		 for(CopyEmp emp : clist) {
			 if(emp.getEmpno() == 300) {
				 emp.setEname("궁금해");
				 System.out.println(emp.toString());
			 }
		 }
		 
		 
		//7.사원정보를 Iterator 인터페이스를 사용해서 출력하세요 
		 System.out.println("**********************************");
		 Iterator<CopyEmp> it = clist.iterator();
		 while(it.hasNext()) {
			CopyEmp e = it.next();
			System.out.println(e.getEmpno() +","+e.getEname()+","+e.getSal());
		 }
	}

}




