package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
  /* public static void main(String[] args){
        HashSet<Integer> set = createSet();
        for(Integer s : set){
            System.out.println(s);
        }

        removeAllNumbersMoreThan10(set);

        for(Integer s : set){
            System.out.print(s+" ");
        }

    }*/

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<20; i++){

            set.add(i+1);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if(iterator.next() > 10)
                iterator.remove();
        }
        return set;
    }
}
