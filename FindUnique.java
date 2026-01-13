public class FindUnique {
    public static void main(String args[]) {

        int a[] = { 1, 1, 2 };
        for (int i = 0; i < a.length; i++) {
            boolean isunique = true;

            for (int j = 0; j < a.length; j++) {

                if (a[i] == a[j] && i != j) {
                    isunique = false;

                }
            }
            if(isunique){
                System.out.println(a[i]+" ");
            }
        }
    }
}
