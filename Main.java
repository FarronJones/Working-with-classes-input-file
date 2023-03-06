/*
 This program inputs the Undergraduates, puts them into an ArrayList, 
prints out the (sorted)list. 
This is then repeated for for Graduates, Faculty, and Staff. 

Undergrads and grads are sorted according to ID. 
Faculty are sorted according to Department and Staff according to Salary. 
 */
package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        /*******************************
         * UNDERGRADUATES
         * ***************************/
        File inFile = new File("undergrad.in");
          Scanner  fileInput = null;
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //create an arrayList
        ArrayList<Undergraduate> myList = new ArrayList<Undergraduate>();
         //input into the ArrayList
        while(fileInput.hasNext())
                { int id=fileInput.nextInt();
                int lev=fileInput.nextInt();
                  String name=fileInput.nextLine();
                  Undergraduate s=new Undergraduate(name, id, lev);
                  myList.add(s);
                    
                }
        
        //sort the arrayList
        Collections.sort(myList);
        //Output the sorted list
        System.out.println("*************************************");
        System.out.println("The undergrads sorted according to ID");
        System.out.println("*************************************");
        for(int i=0; i<myList.size(); i++)
        {
            myList.get(i).writeOutput();
             System.out.println();
        }
        //close the input file
        fileInput.close();
        
        /*******************************
         * GRADUATES
         * ***************************/
         inFile = new File("graduate.in");
         
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //create an arrayList
        ArrayList<Graduate> myList2 = new ArrayList<Graduate>();
         //input into the ArrayList
        while(fileInput.hasNext())
                { int id=fileInput.nextInt();
                String lev=fileInput.next();
                String thesis=fileInput.next();
                boolean t;
                if(thesis.equals("yes")) t=true; else t=false;
                  String name=fileInput.nextLine();
                  Graduate s=new Graduate(name, id, lev, t);
                  myList2.add(s);
                    
                }
        
        //sort the arrayList
        Collections.sort(myList2);
        //Output the sorted list
        System.out.println("*************************************");
        System.out.println("The grads sorted according to ID");
        System.out.println("*************************************");
        for(int i=0; i<myList2.size(); i++)
        {
            myList2.get(i).writeOutput();
             System.out.println();
        }
        //close the input file
        fileInput.close();
         /*******************************
         * Faculty
         * ***************************/
        inFile = new File("faculty.in");
         
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //create an arrayList
        ArrayList<Faculty> myList3 = new ArrayList<Faculty>();
         //input into the ArrayList
        while(fileInput.hasNext())
                { double salary =fileInput.nextDouble();
                int year=fileInput.nextInt();
                int ID = fileInput.nextInt();
                String dept=fileInput.next();
               String title=fileInput.next();
                  String name=fileInput.nextLine();
                 Faculty s=new Faculty(title, name, salary, year,ID, dept);
                myList3.add(s);
                    
                }
        
        //sort the arrayList
        Collections.sort(myList3);
        //Output the sorted list
        System.out.println("*************************************");
        System.out.println("The faculty sorted according to department");
        System.out.println("*************************************");
        for(int i=0; i<myList3.size(); i++)
        {
            myList3.get(i).writeOutput();
            System.out.println();
        }
                
        //close the input file
        fileInput.close();
        
        /*******************************
         * Staff
         * ***************************/
         inFile = new File("staff.in");
         
        try {
          fileInput = new Scanner(inFile);
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Lab10.class.getName()).log(Level.SEVERE, null, ex);
        }
        //create an arrayList
        ArrayList<Staff> myList4 = new ArrayList<Staff>();
         //input into the ArrayList
        while(fileInput.hasNext())
                { double salary =fileInput.nextDouble();
                int year=fileInput.nextInt();
                int ID = fileInput.nextInt();
                String dept=fileInput.next();
               int PG=fileInput.nextInt();
                  String name=fileInput.nextLine();
                 Staff s=new Staff(PG, name, salary, year,ID, dept);
                myList4.add(s);
                    
                }
        
        //sort the arrayList
        Collections.sort(myList4);
        //Output the sorted list
        System.out.println("*************************************");
        System.out.println("The staff sorted according to salary");
        System.out.println("*************************************");
        for(int i=0; i<myList4.size(); i++)
        {
            myList4.get(i).writeOutput();
            System.out.println();
        }
                
        //close the input file
        fileInput.close();
        
    }//end main
    
}//end class
