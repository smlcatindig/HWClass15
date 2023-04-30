package class15;

import org.w3c.dom.ls.LSOutput;

import java.sql.Struct;

public class Students {
    /* Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students

     */

    String name;
    String ID;
   static int numberOfStudents;


    public static void main(String[] args) {
        Students s1=new Students();
        s1.name="Ryan";
        s1.ID="ID1234";
        numberOfStudents++;

        Students s2=new Students();
        s2.name="Suzy";
        s2.ID="ID0987";
        numberOfStudents++;

        Students s3=new Students();
        s3.name="Sarah";
        s3.ID="ID6547";
        numberOfStudents++;

        System.out.println(numberOfStudents);

    }

}
