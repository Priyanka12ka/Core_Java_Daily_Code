/*Q24. Write a Java program to check whether a number is a Neon number or not.
 Input : 9
 Output : Neon Number
 Explanation : 9² = 81 → 8 + 1 = 9.
 */
import java.util.*;
public class PQue15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sqrt=n*n;
        int sumOfDigit=0;
        while(sqrt!=0)
        {

            int rem=sqrt%10;
            System.out.println("rem: "+rem);
            sumOfDigit=sumOfDigit+rem;
            sqrt=sqrt/10;

        }
        if(sumOfDigit==temp)
        {
            System.out.println("Number is neon :");
        }
        else
        {
            System.out.println("Number is not neon");
        }
    }

}
