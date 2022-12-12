package pl.uwm.wmii.lab9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z02_1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        int tab[]= new int[n];
        Random r = new Random();
        for (int j = 0; j < tab.length; ++j) {
            tab[j] = r.nextInt(1999) - 999;
        }
        System.out.println(Arrays.toString(tab));
        int counter =0;
        for (int j = 0; j < tab.length; ++j) {
            if (tab[j] %2 !=0) {
                counter++;
            }
        }
        System.out.printf("Ile nieparzystych %d%n",counter);
    }
}
