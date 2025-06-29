class mamaml{
    void walk(){
        System.out.println("Usually walks on legs");
    }
}
class human extends mamaml{
    void walk(){
        super.walk(); // keyword use to call overriden method from the parentclass
        System.out.println("Human Walks on 2 legs");
    }
}
class dog extends mamaml{
    void walk(){
        super.walk();
        System.out.println("Dogs Walk on 4 legs");
    }
}

public class overriding {
    public static void main(String A[]) {
//        mamaml obj1 = new mamaml();
//        obj1.walk();
        human obj2= new human();
        obj2.walk();
        dog obj3=new dog();
        obj3.walk();
    }
}
