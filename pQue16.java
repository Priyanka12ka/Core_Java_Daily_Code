/*Q32. Write a Java program to check whether a triangle is valid or not using its three angles.
 Input:
 Angle1 = 60
 Angle2 = 60
 Angle3 = 60
 Output : Valid Triangle
 */
import java.util.*;
public class pQue16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 angle of tringle: ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int total=a1+a2+a3;
        if(total==180)
        {
            System.out.println("Triangle is vaild");
        }
        else
             System.out.println("Triangle is Not vaild");

    }

}
