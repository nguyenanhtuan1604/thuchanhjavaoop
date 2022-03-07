import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Appbai11 {
    public static void main(String[] args) {
        var sc = new Scanner(in);
        out.println("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        out.println("Nhập các phần tử của mảng:");
        for ( int i = 0; i < n; i++) {
            out.print("a["+i+"]=");
            arr[i] = sc.nextInt();
        }
        out.println("Mảng đã nhập: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sortAcsen(arr);

        out.println("\nDãy số được sắp xếp tăng dần: ");
        show(arr);
    }

    public static void sortAcsen(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


    public static void show (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}