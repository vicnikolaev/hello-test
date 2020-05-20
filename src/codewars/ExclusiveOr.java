package codewars;

public class ExclusiveOr {
    public static boolean xor(boolean a, boolean b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        System.out.println(xor(true, false));
        System.out.println(xor(true, true));
        System.out.println(xor(false, false));
    }
}
