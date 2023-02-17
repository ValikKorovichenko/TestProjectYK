package absoft;
/*
Напишите программу в которой пользователь вводит свой возраст (соответствющее сообщение должно быть перед вводом)
и выводит одно из следующих сообщений:
Если возраст меньше 21 лет - вывести сообщение "Группа 1"
Если возраст от 21 до 40 лет (включительно) - вывести сообщение "Группа 2"
Если возраст больше 40 лет - вывести сообщение "Группа 3"
 */

import java.util.Scanner;

public class test3_Operators_1 {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 21) {
            System.out.println("Group 1");
        } else if (age >= 21 && age <= 40) {
            System.out.println("Group 2");
        } else if (age > 40) {
            System.out.println("Group 3");
        }
    }

}
