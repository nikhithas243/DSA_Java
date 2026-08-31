import java.util.*;
public class variablepqs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        //Task 1: Find avg of 3 nos
        System.out.println("Enter the 3 nos");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float sum=a+b+c;
        float avg=sum/3;
        System.out.println("Avg is "+avg);
        

        
        //TASK 2: Enter a side of square and give the area
        System.out.println("Enter the side of square");
        float side=sc.nextFloat();
        float area=side*side;
        System.out.println("area of square is "+area);
        

        //TASK 3: Give cost of pen pencil eraser
        System.out.println("Enter cost of pen,pencil and eraser respectively");
        float $pen= sc.nextFloat();
        float $pencil=sc.nextFloat();
        float $eraser=sc.nextFloat();
        System.out.println("Bill amount "+($pen+$pencil+$eraser));
        System.out.println("After Adding 18% GST => "+0.18*($pen+$pencil+$eraser));


    }
}
