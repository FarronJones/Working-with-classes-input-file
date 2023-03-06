
package H9;

//public class Faculty extends Employee, implements Comparable<Faculty>
public class Faculty extends Employee implements Comparable<Faculty>{
		//private String title
	 	private String title;
	 	//default constructor
	 	public Faculty() {
	 		//call super
	 		super();
	 		//title equal null
	 		title = null;
	 	}
	 	//constructor with parameters from person/employee and current class
	    public Faculty(String title, String name,double salary, int hireDate, int id, String dept) {
	    	//super name, salary, hireDate, id, dept
	        super(name,salary, hireDate, id, dept);
	        //this.title equal to title
	        this.title = title;
	    }
	    //getTitle
	    public String getTitle() {
	    	//return title
	        return title;
	    }
	    //setTitle
	    public void setTitle(String title) {
	    	//this.title equal title
	        this.title = title;
	    }
	    //writeOutput method
	    public void writeOutput() {
	    	//super.writeOutput
	        super.writeOutput();
	        //output title
	        System.out.println("Title :" + title);
	    }
	    @Override
		//compareTo method
		public int compareTo(Faculty one) {
	    				//return this.getDept compareTo one.getDept
	    				return this.getDept().compareTo(one.getDept());
	                }//end else
		}//end class