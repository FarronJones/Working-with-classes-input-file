
package H9;

//public class Undergraduate extends Student, implements Comparable<Student>
public class Undergraduate extends Student implements Comparable<Student> {
	//private int level
	private int level;
	//default constructor
	public Undergraduate() {
		//call super
		super();
		//level is equal to zero 
		level=0;
	}
	//constructor parameters
	public Undergraduate(String name,int studentNumber, int level) {
		//super name, studentNumber
		super(name,studentNumber);
		//this.level is equal to level
		this.level = level;
	}
	//getlevel
	public int getlevel() {
		//return level
		return level;
	}
	//setlevel
	public void setlevel(int level) {
		//this.level is equal to level
		this.level=level;
	}
	//writeOutput method
		public void writeOutput() {
			//super.writeOutput
			super.writeOutput();
			//output level
			System.out.println( "level: "+level);
		}
		
}//end class

