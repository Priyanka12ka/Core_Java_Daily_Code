/* 
Q23. Write a Java program to calculate the sum of the first and last digit without using a loop.
 Input : 123
 Output : 4
 */
import java.util.*;
public class PQue14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=0;
        String s=Integer.toString(n);
        first=s.charAt(0)-'0';
        
        System.out.println("last: "+last);
        System.out.println("first: "+first);
        int sum=first+last;
        System.out.println("Sum is: "+sum);
    }

}
