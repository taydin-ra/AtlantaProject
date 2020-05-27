import java.util.TreeMap;

public class AnagramQuestion {
    public static void main(String[] args) {
        	/*
		Given two strings s and t ,
		write a java program to determine if t is an anagram of s.
		Example 1:
		a:3
		n:1
		g:1
		r:1
		m:1
		Input: s = "anagram", t = "nagaram"
		Output: true
		Example 2:
		Input: s = "rat", t = "car"
		Output: false
		Note:
		You may assume the string contains only lowercase alphabets.
		Anagram means, if two String are consist of the same letter
		Example: listen and silent
		 */

        // Hello
        // hi

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
