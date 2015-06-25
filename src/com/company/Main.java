package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //runCommon();
        //fizzbuzz();
        runPalinDrome();
    }

    /**************************************************************************************/
    // Imagine you have two array a = [1,2,3,4,5] and b =[3,2,9,3,7], write a program to find out common elements in both array.

    public static void runCommon(){
        List<Integer> a = randomArrayGen(5);
        List<Integer> b = randomArrayGen(5);
        System.out.println("First array: " + a);
        System.out.println("First array: " + b);
        commonElements(a,b);
        noForLoop(a,b);

    }

    public static void commonElements(List<Integer> a, List<Integer> b){
        List<Integer> common = new ArrayList<Integer>();

        for(int num : a){
          for(int num2 : b){
              if(num == num2){
                  common.add(num);
              }
          }

        }

        System.out.println("For loop result: " + common);
    }

    public static void noForLoop(List<Integer> a, List<Integer> b){
        List<Integer> common = new ArrayList<>(b);
        common.retainAll(a);

        System.out.println("No for loop result: " + common);

    }

    public static List<Integer> randomArrayGen(int length){
        Random rando = new Random();
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i < length; ++i){
            a.add(rando.nextInt()%10);
        }

        return a;

    }
    /**************************************************************************************/

    /**************************************************************************************/
    //fizzbuzz :D

    public static void fizzbuzz(){
        for(int i = 1; i < 101; ++i){
            if(i%3 == 0 || i%5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.println();
            }
            else
                System.out.println(i);
        }

    }
    /**************************************************************************************/


    /**************************************************************************************/
    //Check to see if the string is a palindrome

    public static void runPalinDrome(){
        String a = "racecar";
        palindrome(a);
    }

    public static void palindrome(String a){
        String reverse = new StringBuffer(a).reverse().toString();
        if(reverse.equals(a)){
            System.out.println(a + " is a palindrome!");
        }
        else
            System.out.println(a + " is not a palindrome");
    }

}
