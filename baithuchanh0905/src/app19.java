import java.util.ArrayList;
import java.util.ListIterator;


public class App19 {
    public static void main(String[] arg){
        ArrayList<Character> arrListChar = new ArrayList<>();

        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');

        ListIterator<Character> listIterator = arrListChar.listIterator();

        System.out.println("Cac phan tu co trong arrChar la: ");
        while (listIterator.hasNext())
            System.out.println(listIterator.next() + "\t");
    }
}