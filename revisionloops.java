import java.util.*;
public class revisionloops {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

    //     //TASK 1:PRINT HELLO WORLD 100 TIMES
    //     System.out.println("Enter the number of times you want hello world to be printed");
    //     int n=sc.nextInt(); int c=1;
    //     while(c<=n){
    //         System.out.println("hello world");
    //         c++;
    //     }
    //    //System.out.println("Printed hello world "+n);


    //    //TASK2: PRINT Numbers from 1 to n(while)
    //    System.out.println("Enter the number 1 to n to be printed");
    //    int n=sc.nextInt();
    //    int c=1;
    //    while(c<=n){
    //     System.out.print(c+" ");
    //     c++;
    //    }
    //    System.out.println("Printed numbers.");

    //TASK 3: Sum of first n natural numbers
//    System.out.println("Enter the n for which sum of first n natural numbers needs to be calculated");
//        int n=sc.nextInt();
//         int c=1; 
//         int sum=0;
//     while(c<=n){
//         sum+=c;
//         c++;
//     }
//     System.out.println("Sum is "+sum);

    // //FOR LOOP 
    // //TASK1:print hello world 10 times-for loop
    // for(int i=1;i<=10;i++){
    //     System.out.println("Hello World");
    // }

    // //TASK2:PRINT SQUARE PATTERN
    // // System.out.println("Enter rows where **** pattern is needed");
    // // int n=sc.nextInt();
    // // for(int line=1;line<=n;line++){
    // //     System.out.println("****");
    // // }    

    // // //TASK3:PRINT REVERSE OF NUMBER
    // System.out.println("enter the number to print it's reverse");
    // int num=sc.nextInt();
    // int lastdigit=0;
    // while(num>0){
    //     lastdigit=num%10;
    //     System.out.print(lastdigit);
    //     num=num/10;
    // }

    // // //TASK4:REVERSE A NUMBER
    // // System.out.print("Enter the number to be reversed");
    // // int num=sc.nextInt();
    // // int lastdigit;
    // // int rev=0;
    // // while(num>0){
    // //     lastdigit=num%10;
    // //     rev=rev*10+lastdigit;
    // //     num=num/10;
    // // }
    // // System.out.println("number is "+num+" reverse is "+rev);

    // //DO-WHILE

    // // //TASK1: PRINT HELLO WORLD 10 TIMES USING do-while
    // System.out.println("Printing hello world 10 times using do-while");
    // int count=1;
    // do { 
    //     System.out.println("Hello world "+count);
    //     count++;
    // } while (count<=10);

    // //TASK2: PRINT NOS FROM 1 TO 5 AND EXIT LOOP ONCE 3 IS REACHED
    // System.out.println("Print numbers from 1 to 5 and exit loop once 3 is reached");
    // int counter=1;
    // do { 
    //     if(counter==3)break;
    //     System.out.print(counter);
    // } while (counter<=5);

    // //TASK3:KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10
    // System.out.println("Print all user input except the multiples of 10");
    // do { 
    //     int cnt=sc.nextInt();
    //     if(cnt%10==0)continue;
    //     System.out.println("the user input is "+cnt);
    // } while (true);

    //TASK4:KEEP ADDING I++ FROM i=1 to 5 AND WHEN I=3 THEN SKIP THE ITERATION
    // int i=1;
    // do { 
    //     i++;
    //     if(i==3) continue;
    //     System.out.println(" "+i);
    // } while (i<=5);

    //TASK5:DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT THE ONES WHICH ARE MULTIPLE OF 10
//    System.out.println("enter numbers input");
   
//    do { 
//        int num=sc.nextInt();
//        if(num%10==0)break;
//        System.out.println("number is "+num);
//    } while (true);

    //TASK6: CHECK IF NUMBER IS PRIME OR NOT

    //APPROACH 1: TC=>O(n-2)
        // System.out.println("Enter the number");
        // int n=sc.nextInt();
        // boolean isprime=true;
        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0) isprime=false;
        // }
        // if(isprime) System.out.println(n+" is Prime");
        // else System.out.println(n+" is not Prime");
    
    //APPROACH 2: TC=>O(^n)sqrt(n)<n-2
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) isprime=false;
        }
        if(isprime) System.out.println(n+" is prime");
        else System.out.println(n+" is not prime");

    // //QUESTION 2:WRITE A PROGRAM THAT READS THE SET OF INTEGERS AND GIVES SUM OF ODD AND EVEN INTEGERS
    // int evensum=0,oddsum=0,i=1;
    // do { 
    //     int num=sc.nextInt();
    //     if(num%2==0) evensum+=num;
    //     else oddsum+=num;
    //     i++;
    // } while (i<=10);
    // System.out.println("Sum of even nos "+evensum+ "\nsum of odd numbers"+oddsum);

    // //QUESTION 3:Write a program to find the factorial of any number entered by the user.
    // System.out.println("Enter the number");
    // int n=sc.nextInt();
    // int fact=1;
    // for(int j=2;j<=n;j++){
    //     fact=fact*j;
    // }
    // System.out.println("the factorial of "+n+" is "+fact);

    //QUESTION 4: Write a program to print the multiplication table of a number N, entered by the user.
    // System.out.println("Enter the number");
    // int num=sc.nextInt();
    // for(int i=1;i<=10;i++){
    //     System.out.println(num+" * "+i+" = "+num*i);
    // }

    }
}
