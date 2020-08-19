import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Huong", 31);
        hasMap.put("Hiep", 26);
        hasMap.put("Tin", 25);
        hasMap.put("Long", 25);
        hasMap.put("Phuc", 25);
        hasMap.put("Nguyen", 24);
        System.out.println("Danh sach hoc vien");
        System.out.println(hasMap);

        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Dao nguoc");
        System.out.println(treeMap);
        System.out.println("__________________");


        Map<String, Integer> linkedHasMap = new LinkedHashMap<>();
        linkedHasMap.put("Huong", 31);
        linkedHasMap.put("Hiep", 26);
        linkedHasMap.put("Tin", 25);
        linkedHasMap.put("Long", 25);
        linkedHasMap.put("Phuc", 25);
        linkedHasMap.put("Nguyen", 24);
        System.out.println(linkedHasMap);


    }
}
