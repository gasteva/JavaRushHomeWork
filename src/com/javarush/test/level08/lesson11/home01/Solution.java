package com.javarush.test.level08.lesson11.home01;

import com.javarush.test.level06.lesson11.home02.Cat;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
 Каждый кот с новой строки.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Set<Cat> cats =createCats();

        cats.remove(1);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        Set<Cat> cats = new HashSet<>();
        for (int i = 1; i<3; i++)
            cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat c : cats)
            System.out.println(c);
    }

    public static class Cat{}
}
