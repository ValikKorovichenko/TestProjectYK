package absoft;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

import java.util.Scanner;

public class test2_SumOfElements {
    public static void main(String[] args) {
        System.out.print("Enter the price: ");
        double price = new Scanner(System.in).nextDouble();
        System.out.print("Enter the quantity: ");
        int qty = new Scanner(System.in).nextInt();

        double total = price * qty;

        System.out.println("Total: " + total);
    }
}