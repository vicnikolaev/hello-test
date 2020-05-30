package codewars;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("english", "Welcome");
        hashMap.put("czech", "Vitejte");
        hashMap.put("danish", "Velkomst");
        hashMap.put("dutch", "Welkom");
        hashMap.put("estonian", "Tere tulemast");
        hashMap.put("finnish", "Tervetuloa");
        hashMap.put("flemish", "Welgekomen");
        hashMap.put("french", "Bienvenue");
        hashMap.put("german", "Willkommen");
        hashMap.put("irish", "Failte");
        hashMap.put("italian", "Benvenuto");
        hashMap.put("latvian", "Gaidits");
        hashMap.put("lithuanian", "Laukiamas");
        hashMap.put("polish", "Witamy");
        hashMap.put("spanish", "Bienvenido");
        hashMap.put("swedish", "Valkommen");
        hashMap.put("welsh", "Croeso");

        if (hashMap.containsKey(language)) {
            return hashMap.get(language);
        }
        return hashMap.get("english");
    }

    public static void main(String[] args) {
        System.out.println(Welcome.greet("english"));
        System.out.println(Welcome.greet("polish"));
        System.out.println(Welcome.greet("flemish"));
        System.out.println(Welcome.greet("IP_ADDRESS_REQUIRED "));
    }
}
