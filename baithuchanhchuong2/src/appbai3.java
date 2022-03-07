import java.util.Scanner;
public class Appbai3 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        String str;
        int ns;
        System.out.print("ho va ten: ");
        str=p.nextLine();
        System.out.print("\r\nnam sinh: ");
        ns=p.nextInt();
        int tuoi=2022-ns;
        if(tuoi<16){
            System.out.println("ban "+str+" o do tuoi vi thanh nien");
        }else if(tuoi>=16&& tuoi<18){
            System.out.println("ban "+str+" o do tuoi truong thanh");
        }else System.out.println("ban "+str+" da gia");
    }
}