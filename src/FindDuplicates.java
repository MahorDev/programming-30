import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : arr) {

            if (!seen.add(n)) {
                duplicates.add(n);
            }
        }

        System.out.println(
                "Input: " + Arrays.toString(arr));

        System.out.println(
                "Duplicates: " + duplicates);
    }
}