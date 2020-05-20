package codewars;

public class PointsCalc {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int counter = 0;
        int pointCounter = 0;

        for (int classPoint : classPoints) {
            counter += classPoint;
            pointCounter += 1;
        }

        if (classPoints.length == 0 || ((counter / pointCounter) > yourPoints)) {
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
