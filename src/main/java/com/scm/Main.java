package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Image image1 = new RealImage("123");
//        image1.display();

        Image image2 = new ProxyImage("123");

        image2.display();
    }
}