package Core;

import java.util.Scanner;

public class Variable3 {

    public static void main(String[] args) {

        int age;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Name : ");
        name = sc.nextLine();

        System.out.println("Enter your Age : ");
        age = sc.nextInt();

        System.out.println("Name : " + name + ", Age : " + age);

    }

}
