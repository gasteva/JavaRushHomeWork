package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Vasya" );
        map.put("Ronen", "Gay" );
        map.put("Nudelman", "Vladimir" );
        map.put("Sivak", "Ron" );
        map.put("Sergeev", "Slon" );
        map.put("Bachar", "Kfir" );
        map.put("Filipov", "Mary" );
        map.put("Olen", "Olga" );
        map.put("Denisov", "Lena" );
        map.put("Dokman", "Olena" );
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count =0;
        for (Map.Entry<String,String> pair: map.entrySet())
        {
            if (pair.getValue().equals(name))
                count++;
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count =0;
        for (Map.Entry<String,String> pair: map.entrySet())
        {
            if (pair.getKey().equals(lastName))
                count++;
        }

        return count;
    }
}
