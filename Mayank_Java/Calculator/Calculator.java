package Calculator;
import java.util.Scanner;
import Sub.Subtraction;
import Addition.Addition;
import Div.Division;
import Mul.Multiply;
public class Calculator {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter your choice\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition is: ");
                Addition obj1=new Addition();
                System.out.println(obj1.add(a,b));
                break;
            case 2:
                System.out.println("Subtraction is: ");
                Subtraction obj2=new Subtraction();
                System.out.println(obj2.sub(a,b));
                break;
            case 3:
                System.out.println("Multiplication is: ");
                Multiply obj3=new Multiply();
                System.out.println(obj3.mul(a,b));
                break;
            case 4:
                System.out.println("Division is: ");
                Division obj4=new Division();
                System.out.println(obj4.div(a,b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
