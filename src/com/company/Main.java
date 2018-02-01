package com.company;

import java.util.Scanner;

public class Main {

    public int[] Masyvas;

    public static void main(String[] args) {

        Main objektas = new Main();

        objektas.Ivedimas();
    }

    public void Ivedimas() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu norite ivesti?");
        int KiekSkaiciu = sc.nextInt();

        System.out.println("Iveskite " + KiekSkaiciu + " skaicius");
        Masyvas = new int[KiekSkaiciu];

        for (int i = 0; i < Masyvas.length; i++) {
            Masyvas[i] = sc.nextInt();
        }

        Isvedimas(Masyvas);
    }

    public void Isvedimas(int[] Masyvas) {
        System.out.println("Jusu ivesti skaiciai, kurie didesni uz 100: ");
        for (int i = 0; i < Masyvas.length; i++) {
            if (Masyvas[i] > 100) {
                System.out.println(Masyvas[i]);
            }
        }
    }
}


