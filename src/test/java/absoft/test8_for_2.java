package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main(String[] args) {
        int from = 1;
        int to = 20;
        System.out.print("Enter the number: ");
        int n = new Scanner(System.in).nextInt();

        int i = n;
        if (i < from || i > to) {
            System.out.println("Error, please enter a number between 1 and 20");
        } else {
            for (i = from; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

