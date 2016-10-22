package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> sorce = new ArrayList<>();
        sorce.add("мама");
        sorce.add("мыла");
        sorce.add("раму");
        for(int i = 1;i<=sorce.size(); i+=2){
            sorce.add(i,"именно");
        }
        printList(sorce);

    }

    public static void printList(ArrayList<String> liststr)
    {
        for (int i = 0; i < liststr.size(); i++)
        {
            System.out.println(liststr.get(i));
        }
    }
}



