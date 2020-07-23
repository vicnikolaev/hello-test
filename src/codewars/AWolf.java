package codewars;

public class AWolf {
    public static String warnTheSheep(String[] array) {
        int size = array.length - 1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals("wolf")) {
                return "Oi! Sheep number " +  size  + "! You are about to be eaten by a wolf!";
            }

            size -= 1;
        }

        return "Pls go away and stop eating my sheep";
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "wolf"}));
    }
}
