

package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        //  int[] arr1={8,5,7,3,-10,20 ,65,1};
//TestClass t=new TestClass();
//new int [] test ;

        //   System.out.println( Arrays.toString(t.ArrSorting(arr1)));

  /*      for (int v : t.ArrSorting(arr1))
            System.out.println(v);*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("input data: ");
        String t =scanner.nextLine();

      if ( !t.isEmpty()==true )
      {
          System.out.println("output : "+t);
      }



   /*     final Scanner scanner = new Scanner(System.in);
        for (String line = scanner.nextLine(); !line.isEmpty(); line = scanner.nextLine()) {
            System.out.println(line);
        }*/
    }
}