package Thr;
import java.lang.Thread;
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A"+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread B"+i);   
        }
    }
}
public class Mythread {
    public static void main(String[] args) {
        A obj=new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }
}
