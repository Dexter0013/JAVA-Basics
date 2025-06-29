interface interface1 {
    void area(float r);
    void perimeter(float r);
    void area(int a, int b);
    void perimeter(int a,int b);
}
class circle implements interface1 {
    public void area(int a, int b){}
    public void perimeter(int a,int b){}
    public void area(float r){
        System.out.println("Area:"+(3.14*r*r));

    }
    public void perimeter(float r){
        System.out.println("Perimeter of a circle:"+(2*3.14*r));
    }
}
class rectangle implements interface1 {
    public void area(int a,int b) {
        System.out.println("Area:"+(a*b));
    }
    public void perimeter(int a, int b) {
        System.out.println("Perimeter"+(2*(a+b)));
    }
    public void area(float r){}
    public void perimeter(float r){}
}
public class interface_shape {
    public static void main(String a[]){
        circle obj1=new circle();
        obj1.area(5);
        obj1.perimeter(1);
        rectangle obj2=new rectangle();
        obj2.area(2,3);
        obj2.perimeter(2,3);
    }
}