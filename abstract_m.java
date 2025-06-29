abstract class mamaml1{
    abstract void walk1();
}
class human1 extends mamaml1{
    void walk1(){
        System.out.println("Human Walks on 2 legs");
    }
}
class dog1 extends mamaml1{
    void walk1(){
        System.out.println("Dogs Walk on 4 legs");
    }
}

public class abstract_m {
    public static void main(String A[]) {
//        mamaml obj1 = new mamaml();
//        obj1.walk();
        human1 obj2= new human1();
        obj2.walk1();
        dog1 obj3=new dog1();
        obj3.walk1();
    }
}
