



package Employee;
public class Employee{
      private String empFirstName;
      private String empLastName;
      private long empPhNo;
      private double empSalary;

public Employee(String empFirstName,String empLastName,long empPhNo,double empSalary){
	this.empFirstName=empFirstName;
	this.empLastName=empLastName;
	this.empPhNo=empPhNo;
	this.empSalary=empSalary;
}
	public String toString(){
	 return "EmpFirstName"+" "+this.empFirstName+" "+"EmpLastName"+" "+this.empLastName+" "+"EmpPhNo"+" "+this.empPhNo+" "+"EmpSalary"+" "+this.empSalary;
}

	public String getempFirstName(){
	return empFirstName;
}
	public void setempFirstName(String empFirstName){
	this.empFirstName=empFirstName;
}
	public String getempLastName(){
	return empLastName;
} 
	public void setempLastName(String empLastName){
	this.empLastName=empLastName;
}
	public long getempPhNo(){
	return empPhNo;
}
	public void setempPhNo(long empPhNo){
	this.empPhNo=empPhNo;
}
	public double getempSalary(){
	return empSalary;
}
	public void setempSalary(double empSalary){
	this.empSalary=empSalary;
}
	
}