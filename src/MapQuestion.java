import java.util.HashMap;

public class MapQuestion {
    public static void main(String[] args) {
        //	    Modify and print the given map as follows:
//	    for this problem the map may or may not contain the "a" and "b" keys.
//	    If both keys are present, append their 2 string values together
//	    and store the result under the key "ab" and print the value of the "ab" key
        // if the map doesn't contain both "a" and "b" keys, just print the map
//	    {"a": "Hi", "b": "There"} → {"a": "Hi", "ab": "HiThere", "b": "There"}
//	    {"a": "Hi"} → {"a": "Hi"}
//	    {"b": "There"} → {"b": "There"}

        HashMap<String,String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("c", "There");

        System.out.println(  checkMap(map, "a","c")  );
    }
    public static HashMap<String, String> checkMap(HashMap<String,String> map,String a, String b){

        if(map.containsKey(a) && map.containsKey(b))
            map.put(a+b,map.get(a)+map.get(b));

        return map;
    }


}
