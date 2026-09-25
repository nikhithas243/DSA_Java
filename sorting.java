import java.util.*;
public class sorting {
    public static void bubble_sort(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1-i;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[6];
        System.out.println("Enter the array ");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        bubble_sort(num);
        System.out.println("Bubble sort the array ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}
