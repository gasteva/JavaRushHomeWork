package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> listStr = new ArrayList<>();
        //BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        /*for (int i = 0; i<5; i++){
            String cur = read.readLine();
            listStr.add(cur);
        }*/
        listStr.add("polna");
        listStr.add("jopa");
        listStr.add("ogurzov");
        listStr.add("i");
        listStr.add("pomidorov");

        System.out.println(listStr.size());
        for (int i = 0; i<listStr.size(); i++){
            System.out.println(listStr.get(i));
        }

    }
}
