import java.util.Scanner;
import java.util.LinkedList;
import java.text.DecimalFormat;

public class App111 {
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
        double tbCong;
        DecimalFormat DCF = new DecimalFormat("#.##");
        Scanner TBC = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
         
    System.out.println("Nhập vào số phần tử của danh sách: ");
    n = TBC.nextInt();
         
    for (int i = 0; i < n; i++) {
        System.out.println("Nhập vào phần tử thứ " + i + ": ");
        node = TBC.nextInt();
        linkedList.add(node);
    }
         
    for (int i = 0; i < n; i++) {
        if (linkedList.get(i) % 2 == 0) {
            sum += linkedList.get(i);
            count++;  
        }
    }

    tbCong = (double)sum / count;
    System.out.println("Trung bình cộng của các số chẵn trong danh sách = " + 
        DCF.format(tbCong));
    }

}