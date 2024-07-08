import java.util.Scanner;
public class Add {
    public int addition(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Add obj=new Add();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans=obj.addition(a,b);
        System.out.println(ans);
    }
}
