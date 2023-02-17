package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.util.Scanner;

public class test5_Operators_3 {
    public static void main(String[] args) {
        //read source data
        System.out.print("Enter the week day number (from 1 to 7): ");
        int WeekDay = new Scanner(System.in).nextInt();

        //processing
        String result;
        if (WeekDay == 1) {
            result = "Monday";
        } else if (WeekDay == 2) {
            result = "Tuesday";
        } else if (WeekDay == 3) {
            result = "Wednesday";
        } else if (WeekDay == 4) {
            result = "Thursday";
        } else if (WeekDay == 5) {
            result = "Friday";
        } else if (WeekDay == 6) {
            result = "Saturday";
        } else if (WeekDay == 7) {
            result = "Sunday";
        } else {
            result = "Invalid day: " + WeekDay + ", Enter a number from 1 to 7 ";
        }

        //display result
        System.out.println(result);


    }
}

