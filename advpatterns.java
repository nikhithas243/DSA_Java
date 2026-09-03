import java.util.*;

public class advpatterns {

    public static void hollow_rect(int rows,int cols){
    for(int i=1;i<=rows;i++){
    for(int j=1;j<=cols;j++){
        if(i==1||i==rows||j==1||j==cols){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
        }
        System.out.println("");
    }
}

public static void inverted_rotated_half_pyramid(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}


public static void inverted_half_py_withNos(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
public static void Floyd_triangle(int n){
    int count=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" "); 
            count++;
        }
        System.out.println("");
    }
}
public static void O_1Triangle(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
            
        }
        System.out.println();
    }
}
public static void butterfly(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void solid_rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void hollow_rhombus(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if(j==1||i==1||j==n||i==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void diamond(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
//2 EXTRA ASSIGNMENT QUESTIONS FROM THE PDF IN PATTERNS MODULE
public static void number_pyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
       System.out.println();
    }
}

public static void palindrome_pyramid_Nos(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);    
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    //Hollow-rectangle
    hollow_rect(row,col);
    inverted_rotated_half_pyramid(row);
    inverted_half_py_withNos(row);
    Floyd_triangle(row);
    O_1Triangle(row);
    butterfly(row);
    solid_rhombus(row);
    hollow_rhombus(row);
    diamond(row);
    //2 EXTRA ASSIGNMENT QUESTIONS FROM THE PDF IN PATTERNS MODULE
    number_pyramid(row);
    palindrome_pyramid_Nos(col);
}
    
    
}
