package com.company;

import java.util.Scanner;

public class ReadFromConsole {

    static  int ConsInptRead()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your data:1 ");
        int input = scanner.nextInt();
       // scanner.close();
return input;

    }
}
