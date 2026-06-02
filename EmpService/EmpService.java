package EmpService;
import EmpDao.EmpDao;
import SaveEmpDto.SaveEmpDto;
import Employee.Employee;


public class EmpService{
 public Employee saveEmp(SaveEmpDto dto){
Employee employee=new Employee(dto.getempFirstName(),dto.getempLastName(),dto.getempPhNo(),dto.getempSalary());
 EmpDao dao=new EmpDao();
return dao.saveEmp(employee);
}	
}