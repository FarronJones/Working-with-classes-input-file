package main;

//public class Person
public class Person {
	//Protected string name
	 protected String name;
	 //default constructor
	 public Person() {
		 //name equal null
		 name = null;     
		 }
	 //default constructor with parameters
	 public Person(String name) {
		 //this.name = name
		 this.name = name;     
	 }
	 //setName
	 public void setName(String name) {
		 //this.name equal name
		 this.name = name;     
		 }    
	 //getName
	 public String getName() {
		 //return name
		 return name;     
		 }
	 //hasSameName boolean method
	 public boolean hasSameName(Person other) {
                //return this.name.equalsIgnoreCase(other.name);
		 return this.name.equalsIgnoreCase(other.name);
	 }
	 //writeOutput method
	 public void writeOutput() { 
		 //output name
		 System.out.println( "Name: " + name);     
		 }
}//end class
