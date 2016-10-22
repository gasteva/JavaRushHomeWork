package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.print(pair.getKey() + " ");
        System.out.println("");
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
            System.out.print(pair.getKey()+" ");
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Jobs", new Date("JUNE 1 1980"));
        map.put("Hopkins", new Date("JUNE 1 1980"));
        map.put("Korlayn", new Date("JUNE 1 1980"));
        map.put("Pelevin", new Date("NOVEMBER 22 1962"));
        map.put("Ulitskaya", new Date("FEBRUARY 23 1943"));
        map.put("Kernigan", new Date("january 1 1942"));
        map.put("Richi", new Date("SEPTEMBER 9 1941"));
        map.put("Tomson", new Date("FEBRUARY 4 1943"));
        map.put("Peres", new Date("AUGUST 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> keys = new ArrayList<>();
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().getMonth()==5 || pair.getValue().getMonth()==6 || pair.getValue().getMonth()==7)
                keys.add(pair.getKey());
        }
        for(String key: keys)
            map.remove(key);

    }
}
