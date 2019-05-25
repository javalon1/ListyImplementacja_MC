package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {


    public static void zad1() {


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        List<String> listaImion = new ArrayList<>();

        while (true) {
            String imie = scan.next();

            if (imie.equals("-")) {
                for (String el : listaImion) {
                    System.out.println(el);
                }
                break;
            }
            listaImion.add(imie);
        }
    }
}
