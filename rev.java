import java.util.*;
public class rev {
    public static void main(String[] args) {
        System.out.println("Enter the 2 numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int prod=a*b;
        System.out.println("sum is "+sum+" And product is "+prod);
        
        System.out.println("Enter a radius in cms");
        float r=sc.nextFloat();
        float area=3.14f*r*r; //all decimal constants are double type
        System.out.println("Area is "+area);

    }
}
