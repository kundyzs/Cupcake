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
          performInsertionSort(cupcakeNameArray);
          // print sorted list
          System.out.println("----- Sorted array----- ");
          print(cupcakeNameArray);
          
          System.out.println("----- Statistics -----");
          System.out.printf("Size of array = %d\n", cupcakeNameArray.length);
          System.out.printf("Count = %d\n", count);
        }
          private static void performInsertionSort(String[] cupcakeNameArray) {
    }
          // print cupcake array
          public static void print(String[] cupcakeNameArray) {
          System.out.printf("Number\tName\n");
          System.out.printf("------\t---------------\n");
          for (int i = 0; i < cupcakeNameArray.length; i++) {
          System.out.printf("%04d\t%s\n", i, cupcakeNameArray[i]);
          }
        }
          // get array of cupcake names
          public static String[] nameArray(JSONArray cupcakeArray) {
          String[] arr = new String[cupcakeArray.size()];

          // get names from json object
          for (int i = 0; i < cupcakeArray.size(); i++) {
          JSONObject o = (JSONObject) cupcakeArray.get(i);
          String name = (String) o.get("name");
          arr[i] = name;
          }
          return arr;
        }
          public static int[] sort(int[] arr){
            for(int i=1; i< arr.length; i++){
              int key= arr[i];
              int j=i-1;

              while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
              }
              arr[j+1]=key;
            }
            return arr;
          }

          }