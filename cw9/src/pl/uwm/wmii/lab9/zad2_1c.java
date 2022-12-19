package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad2_1c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        int counter =0;
        for(int i=1;i<=n;i++)
        {
            System.out.printf("Podaj liczbę nr %d%n",i);
            int temp = input.nextInt();
            if (temp %2 !=0)
            {
                continue;
            }
            for(int j=0;j<=temp;j++)
            {
                if (j * j == temp)
                {
                   counter++;
                   break;
                }
            }

        }
        System.out.printf("Wynik %d%n",counter);
    }
}
