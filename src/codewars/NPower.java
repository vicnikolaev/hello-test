package codewars;

public class NPower {
    public static int nthPower(int[] array, int n) {
        if (array.length <= n) {
              return -1;
        }

        int result = array[n];

        for (int i = 1; i < n; i++) {
              result *= array[n];
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(nthPower(new int[] {1,2,3,4}, 3)); // res = 64
        System.out.println(nthPower(new int[] {3,1,2,2}, 3)); // res = 8
    }
}
