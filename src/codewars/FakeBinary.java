package codewars;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        String res = "";

        for (int i = 0; i < numberString.length(); i++) {
            if (numberString.charAt(i) <= '5') {
                res += '0';
            } else {
                res += '1';
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("123678"));
    }
}
