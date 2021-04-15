package com.company;

public class InsertionSort {
    //Input array a
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
