import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


import java.text.DecimalFormat;

public class test {
public static void main(String[] args) {
        Map<String, Double> map = new HashMap<String, Double>();

        map.put("Test",1.00);
        map.put("1",1.00);
        map.put("2",1.00);

        for (String key : map.keySet()) {
                // use the key here
                System.out.println(key);
        }
}

}
