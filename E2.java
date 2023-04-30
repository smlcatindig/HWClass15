package class15;

public class E2 {
    /* create a method call it method1. In the body it should print hello world

     */
  void method1(){ // just to print
      System.out.println("hello world");
  }
  /* create a method that takes an array as input. It adds all the numbers from the array
  and returns the sum. Name of the method should be sumArr.
  sumArr({10,10,10}) => 30
  sumArr({10,10,10}) => 60
   */

    int sumArr(int[]arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];

        }
        return sum;
    }
    void printNumber(){
        //sum is a local variable we can't access it in this method
        // System.out.println(sum);
    }

    public static void main(String[] args) {
        E2 e2=new E2();
        int sum=e2.sumArr(new int[]{10,10,10});

        System.out.println(sum);
    }
}
