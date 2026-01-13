/*Q 2)  Rotate Array by K Steps (Right Rotation)
Question:
 Given an array, rotate the array to the right by k steps.
Example:
 Input: [1, 2, 3, 4, 5, 6, 7], k = 3
 Output: [5, 6, 7, 1, 2, 3, 4]
 */


   import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        int n = arr.length;

       
        int rotated[] = new int[n];
        int j = 0;

        for (int i = k + 1; i < n; i++) {
            rotated[j++] = arr[i];
        }

        for (int i = 0; i <= k; i++) {
            rotated[j++] = arr[i];
        }

        System.out.println(Arrays.toString(rotated));
    }
}
