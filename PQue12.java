/*Q16. Write a Java program to print the ASCII value of a given character.
 Input : Character = A
 Output : ASCII value = 65 */

import java.util.Scanner;

public class PQue12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ascii=ch;
        System.out.println("Ascii of ch: "+ch+"ascii: "+ascii);
    }

}
