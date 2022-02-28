//baithuchanh28/02

import java.util.Scanner;
/**
 *
 * @author Admin
 */

public class App2 {
       private static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhap vao so do canh thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao so do canh thu 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhap vao so do canh thu 3:");
        int c = scanner.nextInt();
        if(a<b+c && b<a+c && c<a+b){
            if(a==b && a==c && b==c){
            System.out.println("Day la tam giac deu");
            }
            else if( (a*a==b*b+c*c && b==c) || (b*b==a*a+c*c && a==c) || (c*c==a*a+b*b && a==b) ){
                System.out.println("Day la tam giac vuong can");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Day la tam giac can");
            }
            else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b ){
                System.out.println("Day la tam giac vuong");
            }
            else{
                System.out.println("Day la tam giac thuong");
            }
        }
        else 
            System.out.println("3 canh khong hop len tam giac");
    }   
}