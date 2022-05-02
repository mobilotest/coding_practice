package javaTraining.collections;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Aty");
        map.put(4, "Soldaty");
        map.put(2, "Baty");
        map.put(3, "Shli");

        System.err.println(map.get(1));
        System.out.println();

        for(Map.Entry m: map.entrySet()){
            System.out.println("key: "+m.getKey() + ", value: "+m.getValue());
        }

        System.out.println();
        map.put(4, "Zoldaten");
        System.err.println(map.get(4));
    }
}
