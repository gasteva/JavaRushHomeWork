package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++)
        {
            int cur = Integer.parseInt(reader.readLine());
            arr[i] = cur;
        }
        int low = 0;
        int hight = arr.length - 1;

        Quicksort(arr, low, hight);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }

    public static void Quicksort(Integer[] arr, int low, int high)
    {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            while (arr[i] < pivot)
            {
                i++;
            }

            while (arr[j] > pivot)
            {
                j--;
            }

            if (i <= j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            Quicksort(arr, low, j);

        if (high > i)
            Quicksort(arr, i, high);
    }
}

