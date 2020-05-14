package codewars;

public class AltCase {
    public static String toAlternativeString(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            char tmp = string.charAt(i);

            if (tmp >= 'a' && tmp <= 'z') {
                tmp = (char) (tmp - 32);
            } else if (tmp >= 'A' && tmp <= 'Z') {
                tmp = (char) (tmp + 32);
            }

            result += tmp;
        }

        return result;
    }

    public static void main(String[] args) {
        String test1 = "hello world"; // result must be HELLO WORLD
        String test2 = "hELLo woRLd"; // result must be HellO WOrlD
        String test3 = "HeLlO WorLD"; // result must be hElLO wORld
        String test4 = "12345"; // result must be

        System.out.println(toAlternativeString(test1));
        System.out.println(toAlternativeString(test2));
        System.out.println(toAlternativeString(test3));
        System.out.println(toAlternativeString(test4));
    }
}
