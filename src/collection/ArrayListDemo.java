package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args){
        Student s1 = new Student(101,"Taha",29);
        Student s2 = new Student(102,"Ali",30);
        Student s3 = new Student(103,"Shabbir",31);
        ArrayList<Student> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
//Traversing using foreach loop
        for (Student st:a1
             ) {
            System.out.println(st.rollNo + st.name + st.age);
        }

//        Iterator it = a1.iterator();
//
//        while (it.hasNext()){
//            Student st = (Student) it.next();
//            System.out.println(st.rollNo + " " + st.name + " " + st.age);
//        }

    }
}
