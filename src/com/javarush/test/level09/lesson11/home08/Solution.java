package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.Random;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arr = new ArrayList<>();
        Random random = new Random();
        arr.add(new int[5]);
        for (int i=0; i<arr.get(0).length; i++){
            arr.get(0)[i]=random.nextInt(100);
        }
        arr.add(new int[2]);
        for (int i=0; i<arr.get(1).length; i++){
            arr.get(1)[i]=random.nextInt(100);
        }
        arr.add(new int[4]);
        for (int i=0; i<arr.get(2).length; i++){
            arr.get(2)[i]=random.nextInt(100);
        }
        arr.add(new int[7]);
        for (int i=0; i<arr.get(3).length; i++){
            arr.get(3)[i]=random.nextInt(100);
        }
        arr.add(new int[0]);


        return arr;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
