package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] arr = new int[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arr.length; i++){
            int cur = Integer.parseInt(read.readLine());
            arr[i]=cur;
        }
        int first = 0;
        int last = arr.length-1;

        while(first < arr.length/2){
            arr[first]^=arr[last];
            arr[last]^= arr[first];
            arr[first]^=arr[last];
            first++;
            last--;
        }
        for (int i = 0; i<arr.length; i++)
            System.out.println(arr[i]);
    }

}
