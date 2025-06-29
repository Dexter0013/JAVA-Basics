interface mammals2{// This also doubles as multiple inheritance
    public void walk();
    public void Land();
    public void air();

}
interface feautres {
    public void birth();
    public void interact();
}
class human2 implements mammals2,feautres{
    public void walk(){
        System.out.println("Human Walk on legs");
    }
    public void Land(){
        System.out.println("Humans are land dewelers");
    }
    public void air(){
        System.out.println("Humans are air breathers");
    }
    public void birth(){
        System.out.println("Humans give birth");

    }
    public void interact(){
        System.out.println("Humans can interact with each other");
    }
}


public class interface_m {
    public static void main(String a[]){
        human2 obj=new human2();
        obj.air();
        obj.walk();
        obj.birth();
        obj.interact();
    }
}
