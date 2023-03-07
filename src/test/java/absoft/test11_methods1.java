package absoft;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

import java.util.Scanner;

public class test11_methods1 {
    public static void main(String[] args) {
        System.out.print("Enter the Price: ");
        double price = new Scanner(System.in).nextDouble();
        System.out.print("Enter the Quantity: ");
        int qty = new Scanner(System.in).nextInt();
        double total = total(price, qty);
        System.out.println("Your total = " + total);
    }

    private static double total(double price, int qty) {
        double total = price * qty * 0.8;
        return total;
    }
}
