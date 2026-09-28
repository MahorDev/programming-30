import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : arr) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + map.values());
    }
}