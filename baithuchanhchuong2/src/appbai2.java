import java.util.Scanner;
public class Appbai2 {
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen n: ");
        n=p.nextInt();
        if(n%2==0){
            System.out.println(n+" la so chan");
        }else System.out.println(n+" la so le");
    }
}