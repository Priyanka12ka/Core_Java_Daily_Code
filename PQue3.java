
/*Q3. Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.*/
import java.util.*;

public class PQue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int ans = a + b;
        System.out.println("Addition: " + ans);
        ans = a - b;
        System.out.println("sub: " + ans);
        ans = a * b;
        System.out.println("multiply: " + ans);
        ans = a / b;
        System.out.println("divide " + ans);

    }

}
