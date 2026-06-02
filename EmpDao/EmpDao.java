


package EmpDao;
import Employee.Employee;
import java.util.List;
import java.util.ArrayList;
public class EmpDao{

List<Employee> emp=new ArrayList<>();
public Employee saveEmp(Employee employee){
 emp.add(employee);
return employee;
}
}