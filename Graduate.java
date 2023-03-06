
package H9;

//public class Graduate extends Student
public class Graduate extends Student{
	//private String degree
	private String Degree;
	//private boolean thesis
	private boolean Thesis;
	//default constructor
	public Graduate() {
		//call super
		super();
		//degree equal empty quotes
		Degree="";
		//Thesis is equal false
		Thesis=false;
	}
	//constructor with parameters from Student/Person and current class
	public Graduate(String name,int studentNumber,String Degree,boolean Thesis) {
		//super name, studentNumber
		super(name, studentNumber);
		//this.degree equal degree
		this.Degree=Degree;
		//this.Thesis is equal to Thesis
		this.Thesis=Thesis;
	}
	//getDegree
	public String getDegree() {
		//return Degree
		return Degree;
	}
	//setDegree
	public void setDegree(String Degree) {
		//this.Degree equal Degree
		this.Degree=Degree;
	}
	//getThesis
	public boolean getThesis() {
		//return Thesis
		return Thesis;
	}
	//setThesis
	public void setThesis(boolean thesis) {
		//this.Thesis equal to Thesis
		this.Thesis=Thesis;
	}
	//writeOutput method
	public void writeOutput() {
		//super.writeOutput
		super.writeOutput();
		//output Degree and Thesis
		System.out.println("Degree: "+ Degree);         
		System.out.println("Thesis Completed: "+ Thesis);
	}
}//end class
