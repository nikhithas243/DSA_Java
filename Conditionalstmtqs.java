import java.util.*;
public class Conditionalstmtqs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //QUESTION 1: Enter a number, output if positive or negative
        // System.out.println("Enter the number");
        // int n=sc.nextInt();
        // if(n<0){
        //     System.out.println("Number is negative");
        // }else{
        //     System.out.println("Number is positive");
        // }

        // //question 2:Print if person have fever if temp is greater than 100
        // System.out.println("enter the body temperature in farenheit");
        // int temp=sc.nextInt();
        // if(temp>=100){
        //     System.out.println("You have fever");
        // }else{
        //     System.out.println("You don't have fever");
        // }


        // //QUESTION 3: input 1-7 and output weekday
        // System.out.println("Enter the day number");
        // int day=sc.nextInt();
        // switch (day){
        //     case 1: System.out.println("Monday");break;
        //     case 2: System.out.println("Tuesday");break;
        //     case 3: System.out.println("Wednesday");break;
        //     case 4: System.out.println("Thursday");break;
        //     case 5: System.out.println("Friday");break;
        //     case 6: System.out.println("Saturday");break;
        //     case 7: System.out.println("Sunday");break;
        // }


        //QUESTION 4: Find value of x and y
        //x=false
        //y=63

        //QUESTION 5: input year and print whether it is leap year or not
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if(year%4==0&& year%100!=0|| year %400==0){
                    System.out.println(year+" is a leap year");
                }else{
                    System.out.println(year+" is not a leap year");
                }
    }
}
