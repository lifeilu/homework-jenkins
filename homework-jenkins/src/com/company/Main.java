package com.company;
import BaseClass.Max;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        Max myTest = new Max();
        int maxNum = myTest.getMax(3, 2);
        System.out.println(maxNum);
    }
}
