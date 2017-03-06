package ru.geekbrains.lesson2.exceptions;

/**
 * Created by mikhail.shchegolev on 06.03.2017.
 */
public class ClassA implements InterfaceA, InterfaceB{
    @Override
    public void method1(){
        System.out.println("method 1 Class A");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 class A");
    }
    @Override
    public void method3(){
        System.out.println("m3");
    };
}
