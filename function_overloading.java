class B{
    int age;
    String name;
    void show(int age){
        System.out.println("Age:"+age);
    }
    void show(String name){
        System.out.println("Name:"+name);
    }
    void show(int age,String name){
        System.out.println("Name and age:"+name+" "+age);
    }
}
public class function_overloading {
    public static void main(String a[]){
    B obj=new B();
    obj.show(5);
    obj.show("Hola");
    obj.show(5,"Holla");

}}
