
package Main;


//public class Student extends Person and implements Comparable<Student>
public class Student extends Person implements Comparable<Student>{
	//private int studentNumber
	private int studentNumber;
	//default constructor
	public Student() {
		//call super
		super();
		//student number equal 0
		studentNumber = 0;
	}
	//constructor parameters
	public Student(String name, int studentNumber) {
	//super name
	super(name);
	//this.studentNumber equal studentNumber
	this.studentNumber=studentNumber;
	}
	//getstudentNumber
	public int getstudentNumber() {
		//return studentNumber
		return studentNumber;
	}
	//setstudentNumber
	public void setstudentNumber(int studentNumber) {
		//this.studentNumber equal studentNumber
		this.studentNumber=studentNumber;
	}
	//studentEqual method
	public boolean studentEqual(Student one) {
			//return studentNumber == one.studentNumber
			return studentNumber==one.studentNumber;
		
	}
	//writeOutput method
	public void writeOutput() {
		//super.writeOutput
		super.writeOutput();
		//output studentNumber
		System.out.println( "Student number: "+studentNumber);
	}
	 @Override
		//compareTo method
		public int compareTo(Student one) {
	            //if this.studentNumber greater than one.studentNumber
	               if(this.studentNumber>one.studentNumber) {
	                   //return negative 1
	                   return 1;
	               }
	               //if this.studentNumber less than one.studentNumber
	                if(this.studentNumber<one.studentNumber) {
	                    //return negative one
	                    return -1;
	                }//end if
	                //else
	                else {
	                    //return 0
	                	return 0;
	                }//end else
		}//end compareTo method
}//end class

