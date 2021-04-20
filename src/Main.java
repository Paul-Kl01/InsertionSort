import com.sun.source.tree.WhileLoopTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // list -> eingelesene Werte
        ArrayList<Integer> liste = new ArrayList<Integer>();
        // Datei einlesen
        //Scanner scanner = new Scanner(System.in);
        String dateiname = args[0];
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
        sort(arr);

        for (int u = 0; u < arr.length; u++){
            System.out.println(arr[u] + " ");
        }
    }

    public static void sort(int[] a) {
        long zstVorher;
        long zstNachher;

        zstVorher = System.currentTimeMillis();

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > key) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
        }
        zstNachher = System.currentTimeMillis();
        // Laufzeit der Methode
        System.out.println("Zeit in s: " + (zstNachher-zstVorher)/1000);
    }
}




