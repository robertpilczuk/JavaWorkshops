package interfejsMap;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {


    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();
        employees.put(111, "Jan Kowaski");
        employees.put(222, "Jan Buczy");
        employees.put(333, "Ewa Koń");
        employees.put(444, "Anna Skiba");
        employees.put(555, "Janina Kow");

        System.out.println("Ilość pracowników: " + employees.size());

        Set<Integer> keySet = employees.keySet();
        System.out.println("Klucze:\n" + keySet);
        Collection<String> values = employees.values();
        System.out.println("Wartości:\n" + values);

        Set<Map.Entry<Integer, String>> entrySet = employees.entrySet();
        for (Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }


    }
}
