package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();

        names.add("Gautam");
        names.add("Soumya");
        names.add("Alisha");
        names.add("Aman");

        names.remove("Aman");
        names.add("Himanshi");
        names.add("Sejal");

        System.out.println(names);


    }
}
