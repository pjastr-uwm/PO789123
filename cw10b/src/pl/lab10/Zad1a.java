package pl.lab10;

import java.util.Scanner;
import java.util.Random;

public class Zad1a {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wylosować");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int tab[] = new int[n];
        Random r = new Random();
        r.setSeed(455422);
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(1999)-999;
        }
        int counter=0; // do parzystych
        int counter2=0; //dla nieparzystych
        for(int j=0;j<tab.length;j++)
        {
            if (tab[j] %2 ==0)
            {
                counter++;
            }
            else
            {
                counter2++;
            }
        }
        System.out.printf("Parzyste: %d%n", counter);
        System.out.printf("Nieparzyste: %d%n", counter2);
    }
}

