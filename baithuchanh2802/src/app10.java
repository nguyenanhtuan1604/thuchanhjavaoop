//baithuchanh2802

import java.util.Scanner;
 
public class App10 {
 
    public static void main(String[] args) {
        int number, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong ");
        number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Moi nhap lai so nguyen duong");
            number = scanner.nextInt();
        }
        while (number > 0) {
            number /= 10;
            count++;  
        }
        System.out.println("So cac chu so la: " + count);
    }
}