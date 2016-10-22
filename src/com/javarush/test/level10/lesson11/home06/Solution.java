package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.HashMap;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private String lastName;
        private int weight;
        private int height;

        public Human(String name) {
            this.name=name;
        }

        public Human(String name, int age) {
            this.name =name;
            this.age=age;
        }

        public Human (String name, int age, boolean sex, String lastName, int weight, int height) {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.lastName=lastName;
            this.weight=weight;
            this.height=height;
        }

        public Human (String name, int age, boolean sex, String lastName, int weight) {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.lastName=lastName;
            this.weight=weight;

        }

        public Human (String name, int age, boolean sex, String lastName) {
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.lastName=lastName;

        }

        public Human (String name, int age, boolean sex) {
            this.name=name;
            this.age=age;
            this.sex=sex;

        }

        public Human (String name, boolean sex) {
            this.name=name;
            this.sex=sex;

        }

        public Human (String name, String lastName, int weight) {
            this.name=name;
            this.lastName=lastName;
            this.weight=weight;

        }

        public Human (String name, String lastName) {
            this.name=name;
            this.lastName=lastName;
        }

        public Human (String name, String lastName, int height, int weight) {
            this.name=name;
            this.lastName=lastName;
            this.weight=weight;
            this.height=height;


    }

    }
}
