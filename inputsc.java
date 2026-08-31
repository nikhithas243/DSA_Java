import java.util.*;

public class inputsc {
    public static void main(String args[]){
        //sum, product,area of circle
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int sum=a+b;
        int prod=a*b;
        System.out.println("sum is "+sum);
        System.out.println("product is "+prod);
        System.out.print("Enter the radius of circle(in cms)\n");
        int r=sc.nextInt();
        float area=(float)3.14*r*r;
        System.out.print("Area is"+area);


    }
    
}
