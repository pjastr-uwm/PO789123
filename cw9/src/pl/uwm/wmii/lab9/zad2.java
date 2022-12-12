package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        double tab[] = new double[n];
        for(int i=0; i<n; i++) {
            System.out.printf("Podaj liczbe nr %d%n: ",i+1);
            tab[i] = input.nextDouble();
        }
        for(int i=1; i<n; i++) {
            System.out.printf("Element a_%d =%f%n",i+1,tab[i]);
        }
        System.out.printf("Element a_%d =%f%n",1,tab[0]);
    }
}
