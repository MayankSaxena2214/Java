// import java.util.Scanner;

// public class Area {
//     public float calculateArea(float l){
//         return l*l;
//     }
//     public float calculateArea(float l,float b){
//         return l*b;
//     }
//     public float calculateArea(float r){
//         return 3.14f*r*r;
//     }
//     public static void main(String[] args){
//         int choice;
//         System.out.println("Enter your choice\n1. Area of square\n2.Area of rectangle\n3.Area of circle");
//         Area obj=new Area();
//         Scanner sc=new Scanner(System.in);
//         choice=sc.nextInt();
//         switch(choice){
//             case 1:
//                 float l;
//                 System.out.println("Enter the length of square");
//                 l=sc.nextFloat();
                
//                 System.out.println("Area of square is "+obj.calculateArea(l));
//                 break;
//             case 2:
//                 float l1,b1;
//                 System.out.println("Enter the length of rectangle");
//                 l1=sc.nextFloat();
//                 System.out.println("Enter the breadth of rectangle");
//                 b1=sc.nextFloat();
//                 System.out.println("Area of rectangle is "+obj.calculateArea(l1,b1));
//                 break;
//             case 3:
//                 float r;
//                 System.out.println("Enter the radius of circle");
//                 r=sc.nextFloat();
//                 System.out.println("Area of circle is "+obj.calculateArea(r));
//                 break;
//             case 4:
//                 System.out.println("INvalid choice");

//         }
//     }
// }
import java.util.Scanner;

public class Area {
    // Method to calculate the area of a square
    public float calculateArea(float side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public float calculateArea(float length, float width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public float calculateArea(float radius) {
        return (float) (3.14 * radius * radius);
    }

    public static void main(String[] args) {
        int choice;
        System.out.println("Enter your choice\n1. Area of square\n2.Area of rectangle\n3.Area of circle");
        Area obj = new Area();
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                float side;
                System.out.println("Enter the side of square");
                side = sc.nextFloat();
                System.out.println("Area of square is " + obj.calculateArea(side));
                break;
            case 2:
                float length, width;
                System.out.println("Enter the length of rectangle");
                length = sc.nextFloat();
                System.out.println("Enter the width of rectangle");
                width = sc.nextFloat();
                System.out.println("Area of rectangle is " + obj.calculateArea(length, width));
                break;
            case 3:
                float radius;
                System.out.println("Enter the radius of circle");
                radius = sc.nextFloat();
                System.out.println("Area of circle is " + obj.calculateArea(radius));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}