package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "MAY 1 2016";
        boolean a = isDateOdd(s);
    }

    public static boolean isDateOdd(String date)
    {
        boolean bool;
        Date date1 = new Date(date);
        Date ms = new Date();
        ms.setHours(0);
        //System.out.println(ms.getHours());
        ms.setMinutes(0);
        //System.out.println(ms.getMinutes());
        ms.setSeconds(0);
        //System.out.println(ms.getSeconds());
        ms.setMonth(0);
        //System.out.println(ms.getMonth());
        ms.setDate(1);
        //System.out.println(ms.getDate());
        long num = date1.getTime()-ms.getTime();
        System.out.println(ms.getTime());
        System.out.println(date1.getTime());
        System.out.println(num);
        long dayMs = 24 * 60 * 60 * 1000;
        int day = (int) (num/dayMs);
        bool = day % 2 == 0;
        return bool;

    }
}
