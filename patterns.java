import java.util.*;
public class patterns {
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();

    //Pattern 1 :Print star pattern
    
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    
        //PATTERN 2: INVERTED STAR TRIANGLE

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //PATTERN 3 : Number triangle

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //PATTERN 4: Character triangle
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);ch++;
            }
            System.out.println();
        }

    }
}
