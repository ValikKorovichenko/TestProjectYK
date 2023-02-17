package absoft;
// import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

import java.util.Scanner;

public class test1_simplePrint {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        String name = new Scanner(System.in).nextLine();
        System.out.println("How old are you?");
        int age = new Scanner(System.in).nextInt();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
}


