package pl.lab10;

import java.util.Random;
import java.util.Scanner;

public class Zad2a {

    public static void main(String[] args)
    {
        System.out.println("Podaj ile liczb chcesz wylosować");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int tab[] = new int[n];
        generuj(tab,-999,999);
        System.out.printf("Parzyste: %d%n",ileParzystych(tab));
        System.out.printf("Nieparzyste: %d%n", ileNieparzystych(tab));
    }

    public static void generuj (int tab[], int minWartosc, int maxWartosc)
    {
        Random r = new Random();
        r.setSeed(455422);
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(maxWartosc-minWartosc+1)-minWartosc;
        }
    }

    public static int ileNieparzystych (int tab[])
    {
        int counter=0;
        for(int j=0;j<tab.length;j++)
        {
            if (tab[j] %2 !=0)
            {
                counter++;
            }
        }
        return counter;
    }

    public static int ileParzystych (int tab[])
    {
        int counter=0;
        for(int j=0;j<tab.length;j++)
        {
            if (tab[j] %2 ==0)
            {
                counter++;
            }
        }
        return counter;
    }
}
