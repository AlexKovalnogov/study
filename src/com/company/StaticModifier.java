package com.company;

public class StaticModifier {

    static int var1;
    static String var2;

    static {

        var1 = 12;
        var2 = "Initializing_Var2";

    }
static int var3=3;
static String var4="Hello";


    static void OutputFunction(int first, String second) {

        System.out.println(second + "  "+first);
    }

    public static void main(String[] args) {

       // System.out.println("wefee");
        OutputFunction(var3,var4);

    }
}