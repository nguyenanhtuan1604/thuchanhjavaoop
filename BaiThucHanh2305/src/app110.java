import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua day: ");
        do{
            n = sc.nextInt();
            if(n <= 0){
                System.out.print("Nhap n > 0");
            }
        }while (n <= 0);

        ArrayList<Integer> ListInt = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int tmp;
            System.out.printf("Nhap phan tu thu %d: ", i);
            tmp = sc.nextInt();
            ListInt.add(tmp);
        }

        int max = ListInt.get(0);
        for (int number : ListInt) {
            max = (number > max) ? number : max;
        }
        System.out.println("max = " + max);

        System.out.print("Nhap so can xoa: ");
        int number = sc.nextInt();
        int len = ListInt.size();
        for (int i = 0; i < len; i++) {
            if(ListInt.get(i) == number){
                ListInt.remove(i);
            }
        }

        Collections.sort(ListInt);
        ListInt.forEach(e -> System.out.println(e));
    }
}