package com.hdecoded;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.insert(70);
        numbers.insert(80);
        numbers.insert(90);
//        System.out.println(numbers.counter);
        numbers.removeAt(5);
//        System.out.println(numbers.counter);
        System.out.println(numbers.indexOf(67));
//        System.out.println(numbers.max());
        Array numbers2 = new Array(4);
        numbers2.insert(60);
        numbers2.insert(70);
        numbers2.insert(80);
        numbers2.insert(90);
        numbers2.intersect(numbers).print();
        System.out.println();
        numbers.reverse().print();

        numbers.insertAt(60,5);

    }
}
