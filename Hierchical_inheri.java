import ani.Animal;
import ani.India;// user defined packages


class Shape{
    void show(){
        System.out.println(" and it is a Shape");
    }
}
class Plane extends Shape{
    void show1(){
        System.out.print("It is a Plane");
    }
}
class Car extends Shape{
    void show2(){
        System.out.print("It is a car");
    }
}


public class Hierchical_inheri {
    public static void main(String a[]){
        Plane obj1=new Plane();
        obj1.show1();
        obj1.show();
        Car obj2=new Car();
        obj2.show2();
        obj2.show();

    Animal obj=new Animal(); // used from the ani package
    obj.show();
    India N= new India();
    N.size();
    N.population();
    N.terrain();
    N.terrain();


    }
}
