/*Q 1) Check if Array is Sorted (Ascending Order)
Question:
 Write a Java program to check if an array is sorted in ascending order.
Example:
 Input: [1, 2, 3, 4, 5] → Output: true
 Input: [1, 3, 2] → Output: false
 */

import java.util.*;
public class CheckAscORnot {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of array  ");
         int n=sc.nextInt();
         int a[]=new int[n];
         System.out.println("Enter element in array: ");
         for(int i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         checkAsc c=new checkAsc();
         c.fun(a);
    }
    
}
class checkAsc{
    boolean flag=false;
    public void fun(int arr[])
    { int i;
        for( i=0;i<arr.length-1;i++)
        {
            
                if(arr[i]>arr[i+1])
                {
                    flag=true;
                   
                }
            
        }
        if(!flag)
        {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
