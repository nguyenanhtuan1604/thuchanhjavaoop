import java.util.Scanner;
public class Appbai6 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen duong n: ");
        n = p.nextInt();
        int giaithua=1;
        do {
            giaithua *= n;
            n -= 1;
        }while (n!=0);
        System.out.println("n!= "+giaithua);
    }
}