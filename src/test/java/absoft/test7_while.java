package absoft;
/*
Написать программу которая будет выводить цифры от 1 до 10 используя цикл while
Когда цифра будет равна 2 или 6 или 10 - вывести сообщение ("[число] - some cool text")
 */

public class test7_while {
    public static void main(String[] args) {
        int from = 1;
        int to = 10;

        int i = from;
        while (i <= to) {
            System.out.println(i);
            i++;
            }
        System.out.println(i == 2 ? i + " - some cool text" : "");
        }
    }



