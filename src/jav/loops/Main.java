package jav.loops;

public class Main {
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 9223372036854775807L;
    float myFloat = 12.23f;
    double myDouble = 123.123;
    char myChar = 'b';
    boolean myBoolean = false;

    public static void main(String[] args) {
        System.out.println("taskTree " + taskThree(25.4, 12.55, 11.1, 54.23));
        System.out.println("taskFour " + taskFour(2,5));
        System.out.println("taskFour " + taskFour(19,5));
        System.out.println("taskFive " + taskFive(9));
        System.out.println("taskFive " + taskFive(-1));
        System.out.println("taskSix " + taskSix(-1));
        System.out.println("taskSeven:");
        taskSeven("Bob");
        System.out.println("taskEight:");
        taskEight(4);
        taskEight(5);
        taskEight(100);
        taskEight(104);
        taskEight(400);
        taskEight(300);
        taskEight(0);
        taskEight(1352);
        taskEight(1986);
        taskEight(1800);

    }

    public static double taskThree (double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    public static boolean taskFour(int a, int b) {
        int sum = a+b;
        return sum <= 20 && sum >= 10;
    }

    public static String taskFive(int i) {
        return (i >= 0) ? "Положительное" : "Отрицательное";
    }

    public static boolean taskSix(int h) {
        return h < 0;
    }

    public static void taskSeven(String name) {
        System.out.println("Привет, "+  name + "!");
    }

    public static void taskEight(int year) {
        if (year%400==0 || (year%4==0 && year%100!=0))
            System.out.println(year + " Високосный");
        else System.out.println(year + " Не високосный");
    }
}
