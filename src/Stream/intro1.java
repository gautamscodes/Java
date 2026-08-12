package Stream;

import java.util.List;

public class intro1 {
    public static void main(String[] args){
        List<String> employess = List.of("Rahul", "Amit", "Rohit", "Ankit",
                "Gautam","Soumya","Alisha","Aman");

//        System.out.println(employess.size());
//        System.out.println(employess.get(0));
//        System.out.println(employess.contains("Rahul"));

//        Stream
        employess.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }


}
