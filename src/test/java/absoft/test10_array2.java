package absoft;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.Arrays;

public class test10_array2 {
    public static void main(String[] args) {
        ///read source data
        String[] array = {"John", "Dan", "Ashe", "Carl", "Bill"};

        //processing
        Arrays.sort(array);
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        for (int i = 0; i < array.length + 1; i++) {
            newArray[newArray.length - 1] = "Stan";

            //display result
            System.out.println(newArray[i]);
        }

    }

}
