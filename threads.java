import java.lang.*;

class myrunnable implements Runnable {
    public void run() {
        for(int i=0;i<5;i++){
        System.out.println("Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                System.out.println("Runntime exception");
            }
        }

    }
}
class mythreads extends Thread{
    void runnning(){
        for(int i=0;i<5;i++){
            System.out.println("Thread"+i);
            try{
                Thread.sleep(1000);
            }
            catch(java.lang.Exception e){
                System.out.println("Runntime Exception");
            }
        }

    }
}
public class threads {
    public static void main(String a[]){
    Thread t=new Thread(new myrunnable());
    t.run();
    mythreads l=new mythreads();
    l.runnning();}
}
