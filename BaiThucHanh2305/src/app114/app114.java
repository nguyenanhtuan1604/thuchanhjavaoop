package App114;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class App114 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, stt;
        String name;

        Map<Integer, Student> students = new LinkedHashMap<>();
        System.out.println("Nhap so sinh vien: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten sinh vien [" + (i + 1) + "]: ");
            System.out.println("Nhap stt: ");
            stt = sc.nextInt();
            Student std = new Student();
            std.nhapSV();
            students.put(stt, std);
        }
        
        
        Set<Integer> keys = students.keySet();
        for (Integer key : keys) {
            Student std = students.get(key);
            System.out
                    .println("Student[" + key + "]: " + std.getHoTen() + " - " + std.getMaSV() + " - " + std.getLop());
        }

    }
}