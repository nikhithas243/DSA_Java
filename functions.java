import java.util.*;
public class functions {
    public static void helloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.print("The value of first number "+a+" The value of second number "+b+"\n");
    }
    public static int product(int a,int b){
        return a*b;
    }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static float binCoeff(int n,int r){
        float fact_n=factorial(n);
        float fact_r=factorial(r);
        float fact_nmr=factorial(n-r);
        return (fact_n/(fact_r*fact_nmr));
    }
    //FUCNTION OVERLOADING- Number of parameters
    public static int multiply(int a,int b){
        return a*b;
    }

    public static int multiply(int a,int b,int c){
        return a*b*c;
    }

    //FUNCTION OVERLOADING - Type of parameters
    public static float multiply(float  a,int b){
        return a*b;
    }
    
    public static float multiply(float  a,int b,int c){
        return a*b*c;
    }
    public static boolean prime(int n){
        //o(n-2) time complexity
        // for(int i=2;i<n;i++){
        //     if(n%i==0) return false;
        // }
        // return true;

        //O(^n)
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void primesInRange(int n){
        for(int i=1;i<=n;i++){
            if(prime(i)==true) System.out.print(i+" ");
        }
    }

    public static int BintoDec(int n){
        //n is binary number
        int ld;
        int pow= 0,dec=0;
        while(n>0){
            ld=n%10;
            dec=dec+ld*(int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
        return dec;
    }
    public static int DectoBin(int n){
        int bin=0,pow=0,rem=0;
        while(n>0){
            rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        return bin;
    }

    public static int avgof3(int a,int b,int c){
        return (a*b*c)/3;
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isPalindrome(int n){
        int myNum=n;
        int rev=0,ld;
        while(n>0){
        ld=n%10;
        rev=rev*10+ld;
        n=n/10;
        }
        return rev==myNum;
    }

    public static int sumofDig(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(){
        Scanner sc=new Scanner(System.in);

        //TASK 1 : Print hello world 
        // helloWorld();

        //TASK 2 :Print calculate sum of 2 numbers
        // System.out.println("Enter two numbers");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // System.out.println("Sum of 2 numbers is "+calculateSum(a,b));

        //TASK 3 :Code to swap 2 values
        // swap(a,b);
        
        //TASK 4 : Find Product of a and b
        // System.out.println("product is "+product(a,b));

        //task 5 : Find factorial of number
        // System.out.print("Enter the number");
        // int n=sc.nextInt();
       // System.out.println("Factorial of "+n+" is " +factorial(n));

        //TASK 6: Find binomial coeff
        // System.out.println("Enter nCr");
        // int num=sc.nextInt();
        // int r=sc.nextInt();
        // System.out.println("The binomial coeff of nCr is "+binCoeff(num,r));

        //TASK 7: Create a calulator
        // System.out.println("the function overloading multiply function "+multiply(a,b,n));
        // System.out.println("the function overloading multiply function "+multiply(a,b));
        // System.out.println("the function overloading multiply function "+multiply(3f,4));
        // System.out.println("the function overloading multiply function "+multiply(4f,b,n));

        //TASK8: check if number is prime or not
        // System.out.println("The number "+n+" is prime: "+prime(n));

        //TASK9: Print primes in the 1 to N range
        // primesInRange(n);

        //Convert a number from binary to decimal
        // System.out.println("Enter a binary number");
        // int number=sc.nextInt();
        // System.out.print("The binary to Decimal is "+ BintoDec(number));
        
        //convert a number from decimal to binary
        // System.out.println("Enter the number to be converted to binary");
        // int decimal=sc.nextInt();
        // System.out.print("The decimal to Binary is "+ DectoBin(decimal));


        //METHOD SCOPE AND CLASS SCOPE
        // int p=10;
        // {
        //    int s=20;
        //     System.out.println(p);
        // }
        // System.out.println(p);
       // System.out.println(s);
        

       
        //ASSIGNMENT

        //QUESTION 1:Compute the average of 3 numbers
        // System.out.println("Enter 3 number to calulate it's average");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // System.out.println("The average of 3 numbers is:"+avgof3(a,b,c));

        //QUESTION 2: Write a method isEven which accepts int. the method should return true if  arg is even
        // System.out.println("Enter a number to decide if odd or even");
        // int number=sc.nextInt();
        // if(isEven(number)){
        //     System.out.println("The number "+number+" is even");
        // }else{
        //     System.out.println("The number "+number+" is odd");
        // }
        
        //QUESTION 3: Palindrome of number
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not a palindrome");
        }
       
        //QUESTION 4 Math class functions: w3schools

        //QUESTION 5: Compute sum of digits in an integer
        System.out.println("Enter the sum of digits "+ sumofDig(n));

        
       
    }
}
