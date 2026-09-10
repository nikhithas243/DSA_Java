import java.util.*;
public class arrayqs {
    public static int linearsearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key)return i;
        }
        return -1;
    }
    public static int menu(String num[],String key){
        for(int i=0;i<num.length;i++){
            if(num[i].equals(key)) return i; //== doesn't work for strings it is .equals() operator
        }
        return -1;
    }
    public static int largest(int num[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>large) large=num[i];
           // large=Math.max(large,num[i]);
        }
        return large;
    }
    public static int smallest(int num[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<small) small=num[i];
           // large=Math.max(large,num[i]);
        }
        return small;
    }
    public static int binarySearch(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }else if(num[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1; 
    }
    public static void reverseI(int arr[]){
        int rev[]=new int[5];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rev[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=rev[i];
        }

    }
    public static void reverseII(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }


    }
    public static void pairsinArr(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")  ");
                count++;
            }
            System.out.println();
        }
        System.out.print("Count of pairs is "+count);
    }
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Enter the array");
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        
        // //LINEAR SEARCH
        // System.out.println("Linear search: Enter key to find");
        // int key=sc.nextInt();
        // if(linearsearch(num, key)==-1){
        //     System.out.println("Key is not found");
        // }else{
        //      System.out.println("Key is at index "+linearsearch(num, key));
        // }

        //LINEAR SEARCH ASSIGNMENT-MENU of Strings
        // String breakfast[]=new String[5];
        // System.out.println("Enter the array");
        // for(int i=0;i<breakfast.length;i++){
        //     breakfast[i]=sc.next();
        // }
        // System.out.println("Linear search: Enter key to find");
        // String key=sc.next();
        // if(menu(breakfast, key)==-1){
        //     System.out.println("Key is not found");
        // }else{
        //     System.out.println("Key is at index "+menu(breakfast, key));
        // }
       
        //LARGEST IN ARRAY
        System.out.println("The largest in array "+largest(num));

        //SMALLEST IN ARRAY
        System.out.println("The smallest in array "+smallest(num));

        //BINARY SEARCH
        // System.out.println("Enter key to search");
        // int key=sc.nextInt();
        // if(binarySearch(num,key)==-1){
        // System.out.println("Element not found");
        // }else{
        // System.out.println("The index where the element is found is "+binarySearch(num,key));
        // }

        //REVERSE AN ARRAY
        // System.out.println("Reverse an array Approach I");
        // reverseI(num);
        // System.out.println("Array is ");
        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]+" ");
        // }
        
        //REVERSE AN ARRAY-APPROACH II
        System.out.println("Reverse an array Approach II");
        reverseII(num);
        System.out.println("Array is ");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]+" ");
        }
        //PAIRS IN AN ARRAY
        pairsinArr(num);
        
    }
}
