
package Main;


//public class Employee extends Person
public class Employee extends Person {
	//private double salary
	private double salary;
	//private int hireDate
	private int hireDate;
	//private int id
	private int id;
	//private string dept
	private String dept;
	//default constructor
	public Employee() {
		//call super
		super();
		//salary = 0.0
		this.salary = 0.0;
		//hireDate = 0
		this.hireDate = 0;
		//id = 0
		this.id = 0;
		//dept = null;
		this.dept = null;     
		}
	//constructor with parameters from Person and current class
	public Employee(String name,double salary, int hireDate, int id, String dept) {
		//super(name)
		super(name);
		this.salary = salary;         
		this.dept = dept;         
		this.id = id;         
		this.hireDate = hireDate;     
		}
	//setSalary
	public void setSalary(double salary) {
		//this.salary equal salary
		this.salary = salary;     
		}
	//getSalary
	public double getSalary() {  
		//return salary
		return salary;     
		}
	//setHireDate
	public void setHireDate(int hireDate) {  
		//this.hireDate equal hireDate
		this.hireDate = hireDate;     
		}
	//getHireDate
	public int getHireDate() {
		//return hireDate
		return hireDate;     
		}
	//setID
	public void setID(int id) {
		//this.id equal id
		this.id = id;     
		}
	//getID
	public int getID() {
		//return id
		return id;     
		}
	//setDept
	public void setDept(String dept) {
		//this.dept equal dept
		this.dept = dept;     
		}
	//getDept
	public String getDept() {
		//return dept
		return dept;     
		}
	//isSameEmployee boolean method
	public boolean isSameEmployee(Employee other) {
		//if this.id equal equal other.id
		 if(this.id == other.id){
			 //return true
			 return true;         
			 }//end if
		 //else
		 else{
			 //return false
			 return false;         
			 }//end else  
		}
	//writeOutput method
	public void writeOutput() {
		//super.writeOutput
		super.writeOutput();
		//output Employee ID, salary, hireDate and department
		System.out.println("Employee ID: " + id);                 
		System.out.println("Salary: " + salary + "\nHire Date: " + hireDate + "\nDepartment: " + dept); 
		} 
}//end class
