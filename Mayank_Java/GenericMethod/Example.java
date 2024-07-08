public class Example {
    public <E> void printArray(E []s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public static void main(String[] args) {
        Example e1=new Example();
        String countries[]=new String[]{"INdia","USa","UK"};
        Integer numbers[]={12,34,42,74};
        e1.printArray(countries);
        e1.printArray(numbers);
    }
}
