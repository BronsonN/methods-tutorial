import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {

    String name = "Bronson";

    printString(name);

    int selection = 2;
    int quantity = 4;

    System.out.println(addition(selection, quantity));

    System.out.println(addition(10, 20));

    System.out.println(firstTwoLetters(name));

    int[] myNumbers = addNumbersToList(2, 4);

    printArray(myNumbers);

  }

  /*
    Good rule of thumb
      - Any block of code that you keep repeating, make into a method.


    Properties of a method


    1. Access - (Access Modifier)
      - public
        - Can be accessed OUTSIDE of the class the method sits in. If you have an object...
      - protected
      - private
        - We'll learn about these later...

    2. Return type
      - int, String, double
      - void - returns nothing
      - Classes/Objects

    3. name (what you call it)

    4. Parameters/Arguments
        (String name) -- whatever sits in the bracks

    5. Method body
      - Code inside the method
  */



  /*
   Print a string
  */
  public static void printString(String whatToPrint) {

    System.out.println(whatToPrint);

  }

  /*
   Add numbers
  */
  public static int addition(int number, int toAdd) {

    int addedNum = number + toAdd;

    return addedNum;
  }

  public static String addStrings(String first, String second) {

    String result = first + second;

    return result;
  }

  public static String firstTwoLetters(String first) {

    String letters = first.substring(0, 2);

    return letters;

  }

  public static int[] addNumbersToList(int first, int second) {

    int[] list = {first, second};

    return list;

  }

  public static void printArray(int[] myArray) {

    for(int i = 0; i < myArray.length; i++){

      System.out.println(myArray[i]);

    }

  }
}
