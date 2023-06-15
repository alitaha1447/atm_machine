package hashmap;

import ArrayListProject.PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, PhoneBook> hm = new HashMap<Integer,PhoneBook>();//upcasting
//        HashMap<Integer, String> hm = new HashMap<Integer,String>();//upcasting
//        hm.put(1,"taha");
//        for (Map.Entry me: hm.entrySet()
//             ) {
//            System.out.println(me.getKey() + " " + me.getValue());
//
//        }

        hm.put(1,new PhoneBook("Taha","456"));
        hm.put(2,new PhoneBook("all","132"));
        for (Integer key: hm.keySet()) {
            System.out.println(key + " " + hm.get(key).getPhoneNumber());
            System.out.println(key + " " + hm.get(key).getName());
        }
//        hm.put(3,"Shabbir");
//        for (Map.Entry map: hm.entrySet()
//        ) {
//            System.out.println(map.getKey() + " " + map.getValue());
//        }
    }
}
