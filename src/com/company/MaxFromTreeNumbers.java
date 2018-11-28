package com.company;

import java.util.*;

public class MaxFromTreeNumbers {


 /*   public int MaxNumber() {

        int var1 = ReadFromConsole.ConsInptRead();
        int var2 = ReadFromConsole.ConsInptRead();
        int var3 = ReadFromConsole.ConsInptRead();

        int[] Arr = new int[3];
        Arr[0] = var1;
        Arr[1] = var2;
        Arr[2] = var3;

        Arrays.sort(Arr) ;


        return Arr[2];
    }*/

    public int maxNumber(int var1 ,int var2, int var3) {

        int[] Arr = new int[3];
        Arr[0] = var1;
        Arr[1] = var2;
        Arr[2] = var3;
        Arrays.sort(Arr);
        return Arr[2];
    }
    public static void main(String[] args) {

    MaxFromTreeNumbers maxFromTreeNumbers = new MaxFromTreeNumbers();
      //  int i = maxFromTreeNumbers.MaxNumber();
       int g = maxFromTreeNumbers.maxNumber(4,4,33);
        System.out.println("Max value  "+g);


    }
}


