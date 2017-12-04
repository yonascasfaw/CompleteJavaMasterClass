package com.Yonas;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] list = getIntegers(10);
        System.out.println("The values you entered are:");
        printArray(list);
        int[] sortedList = sortIntegers(list);
        System.out.println("The sorted array is ");
        printArray(sortedList);
        System.out.println("The original array is");
        printArray(list);

    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];
//        int[] values2 = new int[];

        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
//        int i = 0;
//        do{
//            values2[i] = scanner.nextInt();
//            i++;
//
//        }while(values2[i] != null)

        return values;
    }

    public static void printArray(int[] list){
//        System.out.println("The integer values are:");

        for(int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
    }

    public static int[] sortIntegers(int[] list){
        int[] sorting = list;
        for(int j=0; j<sorting.length;j++) {
            for (int i = 0; i < sorting.length-1; i++) {
                if (sorting[i] < sorting[i + 1]) {
                    int[] temp = {sorting[i + 1]};
                    sorting[i + 1] = sorting[i];
                    sorting[i] = temp[0];
                }
            }
        }
        return sorting;
    }
}
