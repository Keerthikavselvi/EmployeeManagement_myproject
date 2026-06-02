package EmpController;
import EmpService.EmpService;
import Employee.Employee;
import SaveEmpDto.SaveEmpDto;
import java.util.Scanner;
      public class EmpController{
    	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

	SaveEmpDto savedto=new SaveEmpDto();
		System.out.println("Enter your first name: ");
	savedto.setempFirstName(sc.next());
		System.out.println("Enter your last name: ");
	savedto.setempLastName(sc.next());
		System.out.println("Enter your ph no: ");
	savedto.setempPhNo(sc.nextLong());
		System.out.println("Enter your salary: ");
	savedto.setempSalary(sc.nextDouble());

	EmpService service=new EmpService();
	System.out.println(service.saveEmp(savedto));
	
}
}