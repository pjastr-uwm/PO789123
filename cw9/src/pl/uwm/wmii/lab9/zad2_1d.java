package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad2_1d {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        int current =0, prev=0, prev2=0;
        int counter=0;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Podaj liczbę nr %d%n",i);
            if (i>=3)
            {
                prev2=prev;
            }
            if (i>=2)
            {
                prev = current;
            }
            current = input.nextInt();
            if (i>=3 && prev < (prev2+current)/2)
            {
                counter++;
            }
        }
        System.out.printf("Wynik: %d%n",counter);
    }
}
