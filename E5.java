package class15;

public class E5 {
    String name; // instance variables can only be accessed inside instance methods

    void print(){
        int age=10; // local variable
        System.out.println(age);
        System.out.println(name);
    }
    void printInfo(){
        System.out.println(name);
    }
    static void printName(){ // static variable
    //    System.out.println(name);
    }
}
