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
        String s = "anagram", t = "nagaram";
        System.out.println(s+ " and "+t+ " are anagram: " +checkAnagram(s, t) );
        System.out.println("rat"+ " and "+"car"+ " are anagram: " +checkAnagram("rat", "car") );
        System.out.println("fatih"+ " and "+"faith"+ " are anagram: " +checkAnagram("fatih", "faith") );
        System.out.println("fatih"+ " and "+"taf"+ " are anagram: " +checkAnagram("fatih", "taf") );
        System.out.println("fatih"+ " and "+"tif"+ " are anagram: " +checkAnagram("fatih", "tif") );
        System.out.println("kalem"+ " and "+"kelam"+ " are anagram: " +checkAnagram("kalem", "kelam"));
        System.out.println("listen"+ " and "+"silent"+ " are anagram: " +checkAnagram("listen", "silent") );
        System.out.println("listeeeen"+ " and "+"sileeeent"+ " are anagram: " +checkAnagram("listeeeen", "sileeeent") );
    }

    public static boolean checkAnagram(String s, String t) {
        int count=0;
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
     return count==s.length()? true:false;
    }

}
