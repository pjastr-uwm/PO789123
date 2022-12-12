package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        double temp=0;
        for(int i=0; i<n; i++)
        {
            System.out.printf("Podaj liczbe nr %d\n: ",i+1);
            temp+=input.nextDouble();
        }
        System.out.printf("Suma: %f",temp);
    }
}
