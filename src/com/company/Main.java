package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Masyvo dydis : ");
        int dyd = sc.nextInt();
        int[] masyvas = new int[dyd];

        System.out.println("Įveskite skaičius ");
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = sc.nextInt();
        }
        skaiciavimas(masyvas);
    }


    public static void skaiciavimas(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                System.out.println(array[i]);
            }

        }

    }
}