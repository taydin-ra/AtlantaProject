import java.util.TreeMap;

public class AnagramTubaSolution {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();

        String s = "anagram";

        char[] c = s.toCharArray();

        for (char ch : c) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);

        }

        TreeMap<Character, Integer> map1 = new TreeMap<>();
        String s2 = "nagaram";
        char[] c2 = s2.toCharArray();
        {
            for (char ch2 : c2) {
                if (map1.containsKey(ch2)) {
                    map1.put(ch2, map1.get(ch2) + 1);
                } else
                    map1.put(ch2, 1);

            }
            System.out.println(map);
            System.out.println(map1);
        }

        if (map.equals(map1)) {


            System.out.println("they are anagram");

        } else {
            System.out.println("they are not anagram");

        }

    }
    }
