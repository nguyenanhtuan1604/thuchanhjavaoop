import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) throws Exception {
        HashSet<String> Fruit = new HashSet<>();

        Fruit.add("Nho");
        Fruit.add("Bưởi");
        Fruit.add("Táo");
        Fruit.add("Măng cụt");
        Fruit.add("Nhãn");
        Fruit.add("Cam");
        Fruit.add("Chuối");

        int size = Fruit.size();
        System.out.println("Có " + size + " loại trái cây ");

        System.out.println("Nhập tên trái cây cần tìm: ");
        Scanner TCay = new Scanner(System.in);
        String fruitNeed = TCay.next();

        for(String item : Fruit) {
            if(item == fruitNeed){
                System.out.println("Có tôn tại ! ");
            }
            else
                System.out.println("Không tồn tại ! ");
        }

        Fruit.remove("Chuối");
        for(String item : Fruit) {
            System.out.println(item);
        }

        HashSet<String> NewFruit = new HashSet<>();
        NewFruit.add("Mít");
        NewFruit.add("Mơ");

        for(String item : NewFruit) {
            Fruit.add(item);
        }

        Iterator<String> iterator = Fruit.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}