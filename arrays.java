//Arrays=> It is the data structure that contains similar data type and is contingous data type. The array is stored in continous memory locations.
//Array-indexing. Array's location start with 0 index to n-1. It is used to give index and access elements faster
//Create: int arr[]=new int[50];
//Create:int arr[]={"Mango","Apple","pomogranate"};
//Create: int arr[]={24,35,68};
//Input: int arr[0]=sc.nextInt(); 
//Output
//Create 
//Update
//Linear Search

import java.util.*;
public class arrays {
    public static void func(int marks[],int nonChangeable){
        for(int i=0;i<marks.length;i++){
            marks[i]+=10;
        }
        nonChangeable+=20;
    }
    public static void main(String args[]){

        //ARRAYS: CREATION
        int marks[]=new int[49];
        int DefNum[]={9,10,11,12};
        String fruits[]={"Mango","Apple","Watermelon","Pineapple"};
        char ch[]={'f','j','d','k'};
        
        //INPUT
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        //OUTPUT
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //UPDATE
        marks[0]+=10; //+,*,/,%  all these operations can be done     
        System.out.println(marks[0]);

        //Find average of marks
        int avg=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("avg of 3 marks is "+avg);

        //LENGTH FUNCTION: array_name.length
        System.out.println("Length of marks array "+marks.length);
        System.out.println("Length of fruits array "+fruits.length);

        //PAss by reference->arrays
        int nonChangeable=90;
        System.out.print("marks array before passing to function ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        func(marks,nonChangeable);
        System.out.print("marks array after passing to function ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println(nonChangeable);


    }
}

