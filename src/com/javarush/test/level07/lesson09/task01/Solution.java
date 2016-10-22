package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2,
 потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sorce = new ArrayList<>();
        for (int i = 0; i<20; i++){
            sorce.add(Integer.parseInt(read.readLine()));
        }
        ArrayList<Integer> arrOdd = new ArrayList<>();
        ArrayList<Integer> arrEven = new ArrayList<>();
        ArrayList<Integer> arrElse = new ArrayList<>();

        for (int i = 0; i<sorce.size(); i++){
            if (sorce.get(i)%2 == 0 && sorce.get(i)%3 == 0){
                arrOdd.add(sorce.get(i));
                arrEven.add(sorce.get(i));
            }
            else if (sorce.get(i)%3 == 0)
                arrOdd.add(sorce.get(i));
            else if (sorce.get(i)%2 == 0)
                arrEven.add(sorce.get(i));
            else arrElse.add(sorce.get(i));
        }

        printList(arrOdd);
        printList(arrEven);
        printList(arrElse);

    }

    public static void printList(List<Integer> list)
    {
        System.out.println();
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
