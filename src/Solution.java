import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

  private Map<Integer, String> map = new HashMap<>();

  private Map sortByKeys() {
    Map<Integer, String> treeMap = new TreeMap<>(this.map);
    return treeMap;
  }

  private Map sortByValues() {
    List<Map.Entry<Integer, String>> entries = new ArrayList<>();
    for (Map.Entry<Integer, String> entry : this.map.entrySet()) {
      entries.add(entry);
    }

    // 1: Collections.sort(entries, (item1, item2) -> item1.getValue().compareTo(item2.getValue()));
    // 2: Collections.sort(entries, Comparator.comparing(Map.Entry::getValue));
    // 3:
    Collections.sort(entries, Map.Entry.comparingByValue());
    Map<Integer, String> output = new LinkedHashMap<>();
    for (Map.Entry<Integer, String> entry : entries) {
      output.put(entry.getKey(), entry.getValue());
    }
    return output;
  }

  private Map sortByKeysThenValues() {
    return new HashMap();
  }

  public static void main(String[] args){
    Solution obj1 = new Solution();
    Solution obj2 = new Solution();
    Solution obj3 = new Solution();
    
    obj1.insertValues();
    obj2.insertValues();
    obj3.insertValues();

    System.out.println("Original order: ");
    System.out.println(obj1.map);

    System.out.println("\nHashmap sorted by keys: ");
    System.out.println(obj1.sortByKeys());

    System.out.println("\nHashmap sorted by values: ");
    System.out.println(obj2.sortByValues());
  }

  private void insertValues() {
    this.map.put(1, "Devika");
    this.map.put(2, "Saurabh");
    this.map.put(3, "Sanat");
    this.map.put(4, "Parth");
    this.map.put(5, "Jharna");
    this.map.put(6, "Ankita");
  }
}

