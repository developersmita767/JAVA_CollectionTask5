//Convert List of Strings to Set of Strings:
import java.util.*;

public class CollectionTask5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Convert List to Set
        Set<String> set = new HashSet<>(list);

        // Print Set
        System.out.println("Set after converting from List:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
