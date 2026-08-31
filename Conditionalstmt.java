import java.util.*;
public class Conditionalstmt {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        // //TASK1: Print largest of 2 nos
        // System.out.println("Enter 2 nos ");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // if(a>b){
        //     System.out.println(a+" is largest");
        // }else{
        //     System.out.println(b+" is largest");
        // }


        // //TASK2: Print if number is odd or even
        // System.out.println("Enter number to check for odd or even");
        // int num=sc.nextInt();
        // if(num%2==0){
        //     System.out.println(num+" is even");
        // }else{
        //     System.out.println(num+" is odd");
        // }


        // //TASK 3:Find Tax amount for income <5L,5-10L,>10L
        // System.out.println("Enter income in Rs");
        // float income=sc.nextFloat();
        // if (income<=500000){
        //     System.out.println("TAX IS 0");
        // }else if(income>500000 && income<1000000){
        //     System.out.println("tax is 20 percent i.e., "+0.2*income);
        // }else{
        //     System.out.println("tax is 30 percent i.e., "+0.3*income);
        // }


        // //task 4: Find largest of 3 nos
        // System.out.println("To find largest of 3 nos, enter the 3 nos");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // if(a>=b){
        //     if(a>=c){
        //         System.out.println(a+" is the largest");
        //     }else {
        //         System.out.println(c+" is the largest");
        //     }
        // }else{
        //     if(c>b){
        //         System.out.println(c+" is largest");
        //     }else{
        //         System.out.println(b+" is largest");
        //     }
        // }
    

        // //Optimised find largest of 3 nos
        // if(a>=b &&a>=c){
        //     System.out.println(a+" is largest");
        // }else if(b>=c){
        //     System.out.println(b+" is largest");
        // }else{
        //     System.out.println(c+" is largest");
        // }
        
        // //TASK 5: Check if student pass or fail
        // System.out.println("Enter the marks of student");
        // int marks=sc.nextInt();
        // if(marks<33){
        //     System.out.println("the student has failed");
        // }else{
        //     System.out.println("The student has passed");
        // }


        //TASK 6: Calculator Switch 

        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the operator");
        char ch=sc.next().charAt(0);
        System.out.println("Enter the second numer");
        int b=sc.nextInt();

        switch(ch){
            case '+' : System.out.println("Sum is "+(a+b));break;
            case '-' : System.out.println("Subtraction is "+(a-b));break;
            case '*' : System.out.println("Multiplication is "+(a*b));break;
            case '/' : System.out.println("Quotient is "+(a/b));break;
            case '%' : System.out.println("Remainder is "+(a%b));break;
            default : System.out.println("Not a accepted operator");
        }
    }
}
