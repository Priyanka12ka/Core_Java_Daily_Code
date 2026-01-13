/*Q36. Write a Java program to check whether a character is an alphabet or not.
 Input : Character = A
 Output : Alphabet
 */

import java.util.Scanner;

public class PQue18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=sc.nextLine().charAt(0);
        if((ch >='a' && ch<='z')|| (ch>='A' && ch<='Z'))
        {
            System.out.println("its alphabet");
        }
        else
            System.out.println("its not alphabet");
    }

}
