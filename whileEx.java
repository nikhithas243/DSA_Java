import java.util.*;

//Print hello world 100 times.
public class whileEx{
    public static void main(String[] args) {
        int counter=0;
        while(counter<100){
            System.out.println(counter+" hello world");
            counter++;
        }

        //print numbers 1 to 10
        int num=1;
        while(num<=10){
            System.out.print(num+" ");
            num++;
        }
        System.out.println("\nPrint numbers from 1 to n");
        
        //print numbers from 1 to n
        Scanner sc=new Scanner(System.in);
        int nm=sc.nextInt();
        int count=1;
        while(count<=nm){
            System.out.print(count+" ");
            count++;
        }
        System.out.println("Sum of first n natural numbers\nenter natural number");
        int c=1,sum=0;
        int n=sc.nextInt();
        while(c<=n){
            sum+=c;
            c++;
        }
        System.out.println(sum);


    }

}