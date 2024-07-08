package p1;
import java.lang.Thread;
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A"+i);
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread B"+i);
        }
    }
}
public class Example {
    public static void main(String[] args) {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        t1.start();
        t2.start();
    }
}
