import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App112 {
    public static void main(String[] args) throws Exception {
        HashMap<String, Float> SinhVien = new HashMap<>();
        String ten; float diem;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Nhap thong tin sinh vien: ");
            System.out.print("Ten: ");ten = sc.next();
            System.out.print("Diem: ");diem = sc.nextFloat();
            SinhVien.put(ten, diem);
        }while(ten != "");

        
        SinhVien.entrySet().forEach((sv) -> {
            int demTruot = 0;

            if(sv.getValue() <= 5) {
                demTruot++;
                System.out.println(sv.getKey());
            }

            System.out.print("So sinh vien truot la: " + demTruot);
        });

        float max = 0;
        for(Map.Entry<String, Float> item : SinhVien.entrySet()) {
            max = (item.getValue() > max) ? item.getValue() : max;
        }
        System.out.println("Cac sinh vien co diem cao nhat la: ");
        for(Map.Entry<String, Float> item : SinhVien.entrySet()) {
            if(item.getValue() == max) {
                System.out.println(item.getKey());
            }
        }

        System.out.print("Nhap ten can tim: "); ten = sc.next();
        for(Map.Entry<String, Float> item : SinhVien.entrySet()) {
            if(item.getKey() == ten) {
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }
    }
}