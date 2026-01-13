/*Q11. Write a Java program to enter marks of five subjects and calculate total marks and percentage.
 Input : Marks: 70, 75, 80, 65, 60
 Output : Total = 350		Percentage = 70%
 */
import java.util.*;
public class PQue9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  input : ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int total=(i+j+j+l+m);
        int percentage=(total*100)/500;
        System.out.println("Percentages: "+percentage);
    }

}
