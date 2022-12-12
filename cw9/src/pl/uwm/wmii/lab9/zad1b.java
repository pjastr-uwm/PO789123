package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad1b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        double temp=1;
        for(int i=0; i<n; i++)
        {
            System.out.printf("Podaj liczbe nr %d\n: ",i+1);
            temp *=input.nextDouble();
        }
        System.out.printf("Iloczyn: %f\n",temp);
    }
}
