package it.develhope.bo;

public class Start {
    public static void main(String[] args) {

        System.out.println("--------Starting operations-----------");

        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;
        System.out.println("(d / c + 2) >= b || !(c + b - c / a == 3): " + ((d / c + 2) >= b || !(c + b - c / a == 3)));


        System.out.println("---------------------------------------");

        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        System.out.println("(x * x - y * y / 2 != 12) || !t && f): " + ((x * x - y * y / 2 != 12) || !t && f));


        System.out.println("------------------------------------------");

    }
}
