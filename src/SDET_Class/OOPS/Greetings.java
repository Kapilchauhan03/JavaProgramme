package SDET_Class.OOPS;

public class Greetings {

    // ONly using Method to describe all types

    // 1.) No Params NO return type
    void m1()
    {
        System.out.println("Hello .....");
    }

    // 2.) No Params   return type
    String m2()
    {
        return("Hello How are you");
    }
    // 3.) Take Params   No return type

    void m3(String name)
    {
        System.out.println("Hello " +name);
    }

    // 4.) Take Params   return type

    String m4(String name)
    {
        return ("Hello " +name);
    }
}
