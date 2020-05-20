package codewars;

public class PointsCalc {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;

        for (int i : classPoints) {
            average += i;
        }

        if (classPoints.length == 0 || (average / classPoints.length) > yourPoints) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(betterThanAverage(new int[] {}, 0));
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));
        System.out.println(betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
    }
}
