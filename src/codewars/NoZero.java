package codewars;

public class NoZero {
    public static int noBoringZeros(int n) {
        int result = n;

        if (result == 0) {
            return result;
        }

        while (result % 10 == 0) {
            result /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(145000)); // 145
        System.out.println(noBoringZeros(-6706000)); // -6706
        System.out.println(noBoringZeros(0)); // 0
    }
}
