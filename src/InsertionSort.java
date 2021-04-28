import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) throws FileNotFoundException {
        // list -> eingelesene Werte
        ArrayList<Integer> liste = new ArrayList<Integer>();
        // Datei einlesen
        String dateipfad = args[0];
        Scanner read = new Scanner(new File(dateipfad));
        while (read.hasNextLine()){
            liste.add(Integer.valueOf(read.nextLine()));
        }
        read.close();
        int[] arr = new int[liste.size()];

        for (int i = 0; i < liste.size(); i++) {
            arr[i] = liste.get(i);
        }

        final long timeStart = System.nanoTime();
        sort(arr);
        final long timeEnd = System.nanoTime();
        for (int u = 0; u < arr.length; u++){
            System.out.println(arr[u] + " ");
        }
        System.out.println("Laufzeit des Sortieralgorithmus: " + (timeEnd - timeStart) + " Nanosek.");
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > key) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = key;
        }
    }
}
