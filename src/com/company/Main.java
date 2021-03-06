package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //runCommon();
        //fizzbuzz();
        //runPalinDrome();
        //runRemoveChar();
        runPermute();
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
    /**************************************************************************************/


    /**************************************************************************************/
    //Write a method that will remove a given character from a string

    public static void runRemoveChar(){
        String a = "blop";
        removeChar(a,"l");
    }

    public static void removeChar(String a, String CHAR){
        System.out.println("Before: " + a);
        String[] temp = a.split("");
        for(int i = 0; i < temp.length; ++i){
            if(temp[i].equals(CHAR)){
                a = a.replace(CHAR,"");
            }
        }
        System.out.println("After: " + a);
    }
    /**************************************************************************************/


    /**************************************************************************************/
    //3) Print all permutation of String both iterative and Recursive way? (solution)

    public static void runPermute(){
        String a = "aabbcc";
        System.out.println("Expected permutations: " + calcPermutations(a));

    }

    public static void PermutateStringIterative(String a){
        String[] temp = a.split("");


    }

    //sub problem, find number of duplicate characters in a string
    public static int calcPermutations(String a){
        String[] temp = a.split("");
        Map<String, Integer> dict = new HashMap<String, Integer>();


        for(String elm : temp){
            Integer count = dict.get(elm);
                if (count == null) {
                    dict.put(elm, 1);
                }
                else {
                    dict.put(elm, count + 1);
                }
        }

        Object[] dupes = dict.values().toArray();

        int top = Factorial(a.length());
        int bottom = 1;
        for(int i = 0; i < dupes.length; ++i) {
            bottom = bottom * Factorial((Integer) dupes[i]);
        }

        return top / bottom;
    }

    public static int Factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; ++i){
            result = result * i;
        }
        return result;
    }

    /**************************************************************************************/


}
