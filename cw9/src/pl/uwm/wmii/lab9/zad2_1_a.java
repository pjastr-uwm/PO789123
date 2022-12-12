package pl.uwm.wmii.lab9;

import java.util.Scanner;

public class zad2_1_a {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile liczb chcesz wpisac");
        int n = input.nextInt();
        int counter=0;
        for(int i=0; i<n; i++) {
            System.out.printf("Podaj liczbe nr %d%n: ",i+1);
            int temp = input.nextInt();
            if (temp %2 != 0) {
                counter++;
            }
        }
        System.out.printf("Liczb nieprzystych jest %d%n",counter);
    }
}
