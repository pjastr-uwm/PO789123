package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad1g {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        double suma=0;
        double iloczyn=1;
        for(int i=0; i<n; i++)
        {
            System.out.printf("Podaj liczbe nr %d\n: ",i+1);
            double liczba = input.nextDouble();
            suma += liczba;
            iloczyn *= liczba;
        }
        System.out.printf("Suma: %f%n",suma);
        System.out.printf("Iloczyn: %f%n",iloczyn);
    }
}
