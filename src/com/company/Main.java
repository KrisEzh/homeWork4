package com.company;

public class Main {

    public static void main(String[] args) {

        //homeTask 1

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i ++ ;
        } {System.out.println(); }

        for(int start = 10; start > 0; start--) {
            System.out.print(start + " ");
        } {System.out.println(); }

        //homeTask2

        for (int dayNumber = 1; dayNumber <= 31; dayNumber = dayNumber + 7) {
            System.out.println("Сегодня пятница " + dayNumber + " число. Необходимо подготовить отчет.");
                }


        //homeTask3


        for (int cometYear = 1821; cometYear <= 2121; cometYear ++) {
            if (cometYear % 79 == 0)
            System.out.println(cometYear);
        }

        //homeTask4

        int n = 1;
        for(n = 1; n <= 30; n ++) {
            if (n % 3 == 0)
            { System.out.println(n + " ping ");
            continue; }
            {
                if (n % 5 == 0) {
                    System.out.println(n + " pong");
                    continue;
                }
                {
                    if (n % 3 == 0 && n % 5 == 0) {
                        System.out.println(n + " ping pong");
                        continue; }
                    { System.out.println(n); } } } }


        //homeTask5

        int f = 0;
        int a = 1;
        int c = 1;
        while(c <= 10)
        { System.out.print(f + " ");
            int sum = f + a;
            f = a;
            a = sum;
            c ++;


        }






    } }
