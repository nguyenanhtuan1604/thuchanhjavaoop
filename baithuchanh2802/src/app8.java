//baithuchanh2802

import java.util.Scanner;

public class App8 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        int a = 1;
        while(a != 0){
         System.out.print("Nhap so nguyen duong a = ");
        a = scanner.nextInt();
            if(max < a && a % 5 == 0) max = a;    
        }
         System.out.printf("Max = %d", max);
    }
}