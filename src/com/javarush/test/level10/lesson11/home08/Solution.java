package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Random;

/* Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        Random random = new Random();
        int ind = random.nextInt(10);
        ArrayList<String>[] arrayArStr = new ArrayList[ind];
        for(int j=0; j<ind;j++){
            ArrayList<String> arrstr = new ArrayList<>();
            int numStr = random.nextInt(5);
            for(Integer i=0; i<numStr; i++){
                String str="This is str"+i.toString();
                arrstr.add(str);
            }
            arrayArStr[j]=arrstr;
        }

        return arrayArStr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}