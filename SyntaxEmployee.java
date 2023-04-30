package class15;

public class SyntaxEmployee {
    /* create a class called SyntaxEmployee:
    create three variables empID, salary and set the CEO to "Sumair"
    create two objects of the class SyntaxEmployee
    set the value of eID, salary for each of the objects
    print out the eID, salary and CEO for each objects
     */

    String empID;
    double salary;
   static String CEO="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee obj1 = new SyntaxEmployee();
        obj1.empID = "ID12345";
        obj1.salary = 50000;

        System.out.println(obj1.empID);
        System.out.println(obj1.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee obj2 = new SyntaxEmployee();
        obj2.empID = "ID67890";
        obj2.salary = 20000;

        System.out.println(obj2.empID);
        System.out.println(obj2.salary);
        System.out.println(SyntaxEmployee.CEO);





    }
}
