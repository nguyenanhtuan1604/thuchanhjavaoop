import java.util.Scanner;
public class Appbai1 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int a,b;
        System.out.print("nhap 2 so a va b :");
        a=p.nextInt();
        b=p.nextInt();
        System.out.println("tong: "+(a+b));
        System.out.println("hieu a-b: "+(a-b));
        System.out.println("hieu b-a: "+(b-a));
        System.out.println("tich: "+(a*b));
        System.out.println("thuong a/b: "+(a/b));
        System.out.println("thuong b/a: "+(b/a));
        if(a>b){
            System.out.println("a lon hon b");
        }else if(a<b){
            System.out.println("a nho hon b");
        }else System.out.println("a bang b");
    }
}