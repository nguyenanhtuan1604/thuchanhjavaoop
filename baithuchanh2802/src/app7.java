//baithuchanh2802

import java.util.Scanner;
import static java.lang.System.*;

public class App7 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        float max=0;
        float x = 1;
        while ( x !=0){
           out.println("Nhap so thuc :");
            x = sc.nextFloat();
            if(max<=x) max=x;
        }
        out.println("Max= "+max);
    }
}