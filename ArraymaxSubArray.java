
/*1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
 */
import java.util.Scanner;

public class ArraymaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println("Enter Num value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array  element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayMax a = new ArrayMax();
        a.maxarr(arr, k);

    }

}

class ArrayMax {
    void maxarr(int arr[], int k) {

        int maxsum = Integer.MIN_VALUE;
       
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            System.out.print("[");
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + ",");
                sum = sum + arr[j];
            }
            System.out.print("]=");
            System.out.print(sum + "\n");
            if (sum > maxsum) {
                maxsum = sum;

            }
        }
        System.out.println("Maxsum " + maxsum);
    }
}
