package com.sort;

import org.json.simple.*;

public class InsertionSort {
    private static int count=0;

    public static void main(String[] args) {
        String fileName =
          "/Users/jerom/Documents/GitHub/class-java/sort/demo/src/main/java/com/sort/cupcake_3906.json";

          JSONArray cupcakeArray = JSONFile.readArray(fileName);
          String [] cupcakeNameArray = nameArray(cupcakeArray);
          System.out.println(cupcakeNameArray);
          // print unsorted list
          System.out.println("----- Unsorted array -----");
          print(cupcakeNameArray);
          // sort
          InsertionSort(cupcakeNameArray);
          // print sorted list
          System.out.println("----- Sorted array----- ");
          print(cupcakeNameArray);
          
          System.out.println("----- Statistics -----");
          System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
          System.out.printf("Count = %d\n", count);
        }
          // print array
          public static void print(String[] arr) {
          System.out.printf("Number\tName\n");
          System.out.printf("------\t---------------\n");
          for (int i = 0; i < arr.length; i++) {
          System.out.printf("%04d\t%s\n", i, arr[i]);
          }

          }
        }