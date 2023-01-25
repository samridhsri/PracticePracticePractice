package hashmap;

import java.util.HashMap;

public class hashmapUse {

    public static void main(String[] args) {
        HashMap test_map = new HashMap();
        test_map.put("Samridh",100);
        test_map.put("Sam", 50);
        test_map.put("Reaper", 150);

        System.out.println(test_map.get("Sam"));
        System.out.println(test_map.containsValue(51));
    }
}
