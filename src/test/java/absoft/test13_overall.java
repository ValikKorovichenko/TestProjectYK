package absoft;

/*
Напишите программу в которой:
1) Пользователь должен ввести product name, price и qty для 5 продуктов
2) Программа должна посчитать total = price * qty для каждого продукта
3) Программа должна вывести в консоль product name и total по каждому продукта (пример Phone | 120.0)

Note1: price может быть как целым так и дробным числом
Note2: price и qty не могут быть равны "0" (вывести ошибку и прервать программу)
Note3: класс откуда будет раниться тест, должен содержать в себе ТОЛЬКО ВЫЗОВ МЕТОДОВ (допускается создание переменных)
Сами методы должны лежать в отдельном классе и вызываться из него.
 */

import java.util.Scanner;

public class test13_overall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = new String[5];
        double[] prices = new double[5];
        int[] qty = new int[5];
        double[] totals = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product name for product #" + (i + 1) + ":");
            productNames[i] = scanner.nextLine();
            System.out.println("Enter price for product #" + (i + 1) + ":");
            prices[i] = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter qty for product #" + (i + 1) + ":");
            qty[i] = Integer.parseInt(scanner.nextLine());

            if (prices[i] == 0 || qty[i] == 0) {
                System.out.println("Error: price and qty cannot be 0, bye-bye");
                return;
            }
            totals[i] = prices[i] * qty[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(productNames[i] + " | " + totals[i]);
        }
    }
}
class ProductCalculator {
    public static double calculateTotal(double price, int qty) {
        return price * qty;
    }
}
