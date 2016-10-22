package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = createMap();
        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.print(pair.getKey() + " ");
            System.out.println("");
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.print(pair.getKey()+" ");
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Slon" );
        map.put("Ronen", "Gay" );
        map.put("Nudelman", "Vladimir" );
        map.put("Sivak", "Ron" );
        map.put("Sergeev", "Slon" );
        map.put("Bachar", "Kfir" );
        map.put("Filipov", "Mary" );
        map.put("Olen", "Olga" );
        map.put("Denisov", "Lena" );
        map.put("Dokman", "Lena" );
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList <String> names1 = new ArrayList<>();
        ArrayList <String> names2 = new ArrayList<>();
        for (Map.Entry<String,String> pair: map.entrySet())
        {
            String a =pair.getValue();
            if (names1.contains(a)) names2.add(a);
            else {
                if (names1.isEmpty()) names1.add(a);
                else if (!names1.contains(a)) names1.add(a);}


        }
        for (String val:names2){
            System.out.println(val+ " ");
            removeItemFromMapByValue(map,val);
           }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
