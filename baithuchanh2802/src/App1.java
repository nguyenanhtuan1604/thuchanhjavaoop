//baithuchanh28/02

import java.util.Scanner;

public class App1 {

     public static void main(String[] args)  {
    try (Scanner sc = new Scanner(System.in)) {
      int a, b;
      do {
      System.out.println("Moi nhap so nguyen a: ");
      a = sc.nextInt();
      } while (!(a>0));
      do {
      System.out.println("Moi nhap so nguyen b: ");
      b = sc.nextInt();
      } while (!(b>0)); 
      for(int i=Math.min(a, b); i>=1; i--){
          if(a%i==0 && b%i==0){
              System.out.format("Uoc chung lon nhat cua %d và %d la: %d",a,b,i);
              break;
          }
        }
    }
    }
}
