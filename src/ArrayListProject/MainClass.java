package ArrayListProject;

import java.util.ArrayList;
import java.util.List;


public class MainClass {
    public static void main(String[] args) {
        PhoneBook pb1 = new PhoneBook("Taha", "9981341447");
        PhoneBook pb2 = new PhoneBook("Tasneem", "8871693899");
                  //reference          //instance or object
//        PhoneBook pb3 = new PhoneBook("Akbar", "9993187940");
        List<PhoneBook> info = new ArrayList<PhoneBook>();//upcasting
        info.add(pb1);
        info.add(pb2);
        info.add(new PhoneBook("Akbar", "9993187940"));
//info.add("1");
//traversing list
        for (PhoneBook pc : info) {
            System.out.println(pc.getName() + " " + pc.getPhoneNumber());
        }
    }
}

//int[] var1 = new int[5];