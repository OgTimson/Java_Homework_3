/*
Задача 1. Пусть дан произвольный список целых чисел.
1) Найти минимальное значение
2) Найти максимальное значение
3) Найти среднее ариф. значение
4) Нужно удалить из него чётные числа
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> listNums = createList();
        System.out.println("Список целых чисел: " + listNums);

        int minNum = Collections.min(listNums);
        System.out.println("Минимальное значение: " + minNum);

        int maxNum = Collections.max(listNums);
        System.out.println("Максимальное значение: " + maxNum);

        double avgNum = getAvg(listNums);
        System.out.println("Среднее арифметическое значение: " + avgNum);

        ArrayList<Integer> listNoEvenNums = remEvenNums(listNums);
        System.out.println("Список без четных чисел: " + listNoEvenNums);
    }

    public static ArrayList<Integer> createList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
        }

        return list;
    }

    public static double getAvg(ArrayList<Integer> nums) {
        double sumNums = 0;
        for (Integer n : nums) {
            sumNums = sumNums + n;
        }
        double avg = sumNums / nums.size();
        return avg;
    }

    public static ArrayList<Integer> remEvenNums(ArrayList<Integer> numbers) {
        Iterator<Integer> num = numbers.iterator();
        while (num.hasNext()) {
            if (num.next() % 2 == 0) {
                num.remove();
            }
        }
        return numbers;
    }
}