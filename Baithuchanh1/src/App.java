import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String strHoten = "";
        System.out.println("Nhap ho ten: ");
        strHoten = sc.nextLine();
        System.out.println("Xin chào " + strHoten);
    }
}
