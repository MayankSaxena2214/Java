class Outer{
    static int x=10;
     protected class Inner{
        void if1(){
            System.out.println("if1()"+x);
        }
    }
}
public class Example{
    public static void main(String[] args){
        Outer out=new Outer();
        Outer.Inner o1=out.new Inner();
        o1.if1();
    }
}