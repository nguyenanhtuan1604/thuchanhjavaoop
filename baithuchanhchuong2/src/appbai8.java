import java.util.Scanner;
public class Appbai8 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int n,a,sum=0,tbc=0;
        System.out.println("nhap n: ");
        n=p.nextInt();
        System.out.println("nhap "+n+"so: ");
        for(int i=0;i<n;i++){
            a=p.nextInt();
            sum+=a;
            tbc=sum/n;
        }
        System.out.println("Trung binh cong= "+tbc);
    }
}