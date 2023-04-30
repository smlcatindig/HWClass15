package class15;

public class Dog {
    String name;
    String color;
    int age;
    static double weight;
    static String planetName="Earth";

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="green"; // instance variable
        dog.weight=20; // static variable

        Dog dog1=new Dog();
        System.out.println(dog1.weight);
        System.out.println(dog1.color);
    }
}
