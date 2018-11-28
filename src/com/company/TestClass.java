package com.company;


public class TestClass {

  public static  int[]  ArrSorting(int[] arr) {

/*
        boolean var =true;

            while (var) {
                for (int j=0;j<arr.length;j++)
                {
                    for (int i=0;i<arr.length-1;i++) {
                        if (arr[i] > arr[i + 1]) {
                            System.out.println("True");
                            int buf = arr[i];
                            arr[i] = arr[i + 1];
                            arr[i + 1] = buf;
                            var = true;
                        } else var = false;

                    }
                }
        }*/
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length - 1; i++) {
                if (arr[i] > arr[j]) {
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }

            }

        }

return arr;
    }}






