package codewars;

public class HolidayVIII {
    public static void main(String[] args) {
        int normPrice = 17;
        int discount = 10;
        int hol = 500;
        float res = 0;

//        res = (float)(normPrice * discount) / 100;
//        res = hol / res;
        System.out.println(hol*100/(normPrice*discount));
    }
}
 