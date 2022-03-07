import java.util.Scanner;
public class Appbai5 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int n,tong=0;
        while (tong<=100){
            n=p.nextInt();
            tong+=n;
        }
        System.out.println("tong: "+tong);
    }
}