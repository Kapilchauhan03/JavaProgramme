package SDET_Class.OOPS;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings  gr = new Greetings();
        gr.m1();

        // 2 we have to store first then print if we have return type method
        String s = gr.m2();
        System.out.println(s);

        //3.
        gr.m3("Kapil");

        //4.
        String s1 = gr.m4("John");
        System.out.println(s1);

            }

}
