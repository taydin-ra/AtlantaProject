import java.util.HashMap;

public class MapTubaSolution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "Hi");
        map.put("b", "There");
        System.out.println(map);

        if (map.containsKey("a") && map.containsKey("b")) {
            System.out.println("ab: " + map.get("a") + map.get("b"));

        } else if (map.containsKey("b") || map.containsKey("a")) {

            System.out.println(map);
        } else {
            System.out.println();
        }


    }
    }
