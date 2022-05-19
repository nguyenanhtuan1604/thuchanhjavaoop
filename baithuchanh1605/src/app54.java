import java.util.HashSet;
import java.util.Scanner;

public class app54 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashsetstring= new HashSet<>();
        Scanner sc =new Scanner(System.in);

        hashsetstring.add("Wilson");
        hashsetstring.add("Nike");
        hashsetstring.add("Volvo");
        hashsetstring.add("Kia");
        hashsetstring.add("Lenovo");
        hashsetstring.add("Lenovo");

        System.out.println("cac phan tu co trong hashsetstirng la: ");
        System.out.println(hashsetstring);
        System.out.println("nhap cac phan tu can xoa: ");
        name=sc.nextLine();
        if(hashsetstring.contains(name)){
            hashsetstirng.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan tu con lai trong hashsetstring ");
            System.out.println(hashsetstring);
        }
        else{
            System.out.println("xoa khong thanh cong ");
        }
    }
}
