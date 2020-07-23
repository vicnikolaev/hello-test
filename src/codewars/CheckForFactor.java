package codewars;

public class CheckForFactor {
    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkForFactor(10, 2));
        System.out.println(checkForFactor(63, 7));
        System.out.println(checkForFactor(63, 5));
    }
}
