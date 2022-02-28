//baithuchanh2802

import java.util.Scanner;
public class App5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0, a;
    System.out.println("Nhap vao so can xet: ");
    a = sc.nextInt();
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        sum+=i;
    }
    if(sum==a){
      System.out.println(a + " la so hoan hao");
    }else {
      System.out.println(a + " khong phai la so hoan hao");
    }
  }