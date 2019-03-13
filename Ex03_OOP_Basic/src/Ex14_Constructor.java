import kr.or.bit.Employee;

public class Ex14_Constructor {
	public static void main(String[] args) {
		Employee emp = new Employee(); //default
		emp.employeeInfoPrint();
		System.out.println(emp.getEname());
		
		Employee emp2 = new Employee(201901,"ȫ�浿","������");
		emp2.employeeInfoPrint();
		System.out.println(emp2.getEname());
		emp2.setJob("IT������");
		emp2.employeeInfoPrint();
		
		//Array �� ����ؼ� ��� 3���� ����� ������ 
		//��ü �迭 (8���� + String + Array + ����� ���� Ŭ����)
		
		//int[] arr = {10,20,30}
		
		//Employee e = new Employee();
		Employee[] emplist = {new Employee(1, "A", "IT"),
				              new Employee(2, "B", "SALES"),
				              new Employee(3, "C", "IT"),
		                     };
		for(Employee e : emplist) {
			e.employeeInfoPrint();
		}

	}

}
