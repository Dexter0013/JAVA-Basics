import java.util.Scanner;
public class exception_arith {
    public static void main(String a[]){
        Scanner in=new Scanner(System.in);
        try{
//            Scanner in=new Scanner(System.in);
            System.out.println("Enter a no:");
            int i=in.nextInt();
            System.out.println("Heelo"+10/i);
        }
        catch (java.lang.Exception e){
            System.out.println("Arithmetic exception occured");
        }
        finally {
            System.out.println("If Dived by Zero then the program throws exception");
        }
        try{
            System.out.println("Enter Val:");
            byte i= in.nextByte();
            System.out.println("Val:"+i+"Bytes");
        }
        catch (java.lang.Exception e){
            System.out.println("Val out of bounds");
        }

    }
}

