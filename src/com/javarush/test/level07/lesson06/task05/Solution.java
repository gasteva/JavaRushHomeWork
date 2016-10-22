package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listStr = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++){
            String cur = read.readLine();
            listStr.add(cur);
        }
        for (int i = 0; i<13; i++){
            String cur = listStr.get(4);
            listStr.remove(4);
            listStr.add(0,cur);
        }
        for(int i=0; i<listStr.size(); i++){
                System.out.println(listStr.get(i));
        }

    }
}
