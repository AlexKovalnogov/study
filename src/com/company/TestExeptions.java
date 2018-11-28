package com.company;

public class TestExeptions {

    public static void  Run1() throws MyFirstExeptiion
    {

        System.out.println("sdsd");
        throw new MyFirstExeptiion("ErrorЖучузешщ ьуііфпу");

        /*
try{
            System.out.println("sdsd");
            throw new MyFirstExeptiion("Error");
    }
catch (Exception e){
System.out.println(e);
}*/




    }



public static void main(String[] args) {

      //  Run1();

try {
    Run1();
    }
   catch (Exception e)
   {
       System.out.println(e);
   }
}
}
