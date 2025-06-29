// There are three types of constructors in java
// default, parametrized and copy constructor
import java.util.Scanner;
class One1{
    int a;
    int b;
    One1(){ //default constructor called automatically on creation of objects
        System.out.println("Inside Default Constructor");
    }
    One1(int aa , int bb){//Parametrized Constructor
        this.a=aa;
        this.b=bb;
        System.out.println("Inside Parametrized Constructor\n"+(a+b));
    }
    One1(One1 obj2){
        System.out.println("Inside Copy Constructor");
         this.a=obj2.a;
         this.b= obj2.b;

    System.out.println(a);}
}

public class Constructors {
    public static void main(String[] a){
        One1 obj1=new One1();
 //       Scanner input =new Scanner(System.in); // used to take input
//        int[] b=new int[5];
//        int i=0;
//        System.out.println("Enter Value");
//        while(i<5){
//        b[i]= input.nextInt();
//        System.out.println(b[i]);
//        i+=1;}
        One1 obj2=new One1(2,4);
        One1 obj3=new One1(obj2);

    }
}
