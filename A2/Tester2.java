//fireEmployee()

import java.io.*;

public class Tester2 {
  public static void main(String[] args) {

    try {
      PrintStream o = new PrintStream(new File("Student_out2_3.txt"));
      PrintStream console = System.out;

      // Assign o to output stream
      System.setOut(o);
    } catch (FileNotFoundException ex) {
      // insert code to run when exception occurs
    }

    OrgHierarchyInterface org = new OrgHierarchy();

    // hireowner
    try {
      org.hireOwner(10);
    } catch (NotEmptyException e) {
      System.out.println("Exeption3");
    }

    // insert employees
    try {
      org.hireEmployee(60, 10);
      org.hireEmployee(50, 10);
      org.hireEmployee(100, 10);
      org.hireEmployee(30, 10);
      org.hireEmployee(80, 60);
      org.hireEmployee(15, 60);
      org.hireEmployee(70, 60);
      org.hireEmployee(300, 50);
      org.hireEmployee(400, 50);
      org.hireEmployee(8, 100);
      org.hireEmployee(7, 100);
      org.hireEmployee(6, 100);
      org.hireEmployee(5, 100);
      org.hireEmployee(4, 100);
      org.hireEmployee(1000, 30);
    } catch (IllegalIDException e) {
      System.out.println("Exception1");
    }
    try {
      System.out.println(org.toString(10));
      org.fireEmployee(80);
      System.out.println(org.toString(10));
      org.fireEmployee(15);
      System.out.println(org.toString(10));
      org.fireEmployee(70);
      System.out.println(org.toString(10));
      org.fireEmployee(300);
      System.out.println(org.toString(10));
      org.fireEmployee(400);
      System.out.println(org.toString(10));
      org.fireEmployee(8);
      System.out.println(org.toString(10));
      org.fireEmployee(7);
      System.out.println(org.toString(10));
      org.fireEmployee(6);
      System.out.println(org.toString(10));
      org.fireEmployee(5);
      System.out.println(org.toString(10));
      org.fireEmployee(4);
      System.out.println(org.toString(10));
      org.fireEmployee(1000);
      System.out.println(org.toString(10));

      org.fireEmployee(60);
      System.out.println(org.toString(10));

      org.fireEmployee(50);
      System.out.println(org.toString(10));
      org.fireEmployee(100);
      System.out.println(org.toString(10));
      org.fireEmployee(30);
      System.out.println(org.toString(10));

      org.fireEmployee(10);
      System.out.println(org.toString(10));
    } catch (IllegalIDException e) {
      System.out.println("Exeption1");
    }

  }
}
