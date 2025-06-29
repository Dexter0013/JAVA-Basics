class One{
    int a;
    byte b;
    void show(){
        a=270;
        b=(byte)a;
        System.out.println(b+"\nInside class");
    }
}
public class Encapsulation {
    public static void main(String a[]){
        One obj1=new One(); // here One() is the default constructor
        obj1.show();
        System.out.println();
    }
}