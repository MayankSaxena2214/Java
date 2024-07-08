class MyData<T>
{
    T i;
    public void add(T i1){
        i=i1;
    }
    public T get(){
        return (i);
    }
}
public class Example {
    public static void main(String[] args) {
        MyData<Integer> m=new MyData<Integer>();
        Integer k=new Integer(5);
        m.add(k);
        System.out.println(m.get());
        MyData<String> m2=new MyData<String>();
        m2.add("RAhul");
        System.out.println(m2.get());
    }
}
