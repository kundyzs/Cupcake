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
          
          }
