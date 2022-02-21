public class App55 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het  cho 5 tu 0 den 20: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            } else
                continue;
        }
    }
}