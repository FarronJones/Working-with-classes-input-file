
package Main;

//public class Staff extends Employee, implements Comparable<Staff>
public class Staff extends Employee implements Comparable<Staff>  {
		//private int payGrade
	 	private int payGrade;
	 	//default constructor
	 	public Staff() {
	 		//call super
	 		super();
	 		//payGrade equal 0
	 		payGrade=0;
	 	}
	 	//constructor with parameters from Person/employee and current class
	    public Staff(int payGrade,String name,double salary, int hireDate, int id, String dept) {
	    	//super name, salary, hireDate, id, dept
	        super(name,salary,hireDate,id,dept);
	        //if payGrade>=1&&payGrade<=20
	        if(payGrade>=1&&payGrade<=20) {
	        	//this.payGrade equal to payGrade
		        this.payGrade = payGrade;
	        }
	    }
	    //getPayGrade
	    public int getPayGrade() {
	    	//return payGrade
	        return payGrade;
	    }
	    //setPayGrade
	    public void setPayGrade(int payGrade) {
	    	//this.payGrade equal payGrade
	        this.payGrade = payGrade;
	    }
	    //writeOuput method
	    public void writeOutput() {
	    	//super.writeOuput
	        super.writeOutput();
	        //output payGrade
	        System.out.println("PayGrade: " + payGrade);
	    }
	    @Override
		//compareTo method
	    public int compareTo(Staff one) {
	    	  //if this.getSalary greater than one.getSalary
            if(this.getSalary()>one.getSalary()) {
                //return negative 1
                return 1;
            }
            //if this.getSalary is less than one.getSalary
             if(this.getSalary()<one.getSalary()) {
                 //return negative one
                 return -1;
             }//end if
             //else
             else {
                 //return 0
             	return 0;
             }//end else
        }//end else
}//end class

