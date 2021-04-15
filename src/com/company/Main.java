package com.company;

import com.sun.source.tree.WhileLoopTree;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // list -> eingelesene Werte
        ArrayList<Integer> liste = new ArrayList<Integer>();
        // Datei einlesen
        Scanner scanner = new Scanner(System.in);
        String dateiname = scanner.nextLine();
        InputStream is = Main.class.getResourceAsStream("/"+dateiname+".txt");
        Scanner read = new Scanner(is);
        while (read.hasNextLine()){
            liste.add(Integer.valueOf(read.nextLine()));
        }
        read.close();
        int[] arr = new int[liste.size()];

        for (int i = 0; i < liste.size(); i++) {
            arr[i] = liste.get(i);
        }

        // Zahlen sortieren
        InsertionSort.sort(arr);

        for (int u = 0; u < arr.length; u++){
            System.out.println(arr[u] + " ");
        }
    }
}



