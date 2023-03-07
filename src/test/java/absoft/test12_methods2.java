package absoft;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = new Scanner(System.in).nextLine();
        User(name);
        Seat(name);
    }

    private static void User(String name) {
        if (name.equals("Alex") || name.equals("John") || name.equals("Stan")) {
            System.out.println("Hello " + name);
        } else {
            System.out.println("Sorry, name was not found");
        }
    }

    private static void Seat(String name) {
        if (name.equals("Alex")) {
            System.out.println("Your seat is 1");
        } else if (name.equals("John")) {
            System.out.println("Your seat is 2");
        } else if (name.equals("Stan")) {
            System.out.println("Your seat is 3");
        }
    }
}