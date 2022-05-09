import java.util.ArrayList;

public class App18 {
    public static void main(String[] arg){
        ArrayList<Float> arrListFloat = new ArrayList<>();

        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);

        System.out.println("Cac phan tu co trong arrFloat la: ");
        for(int i = 0; i < arrListFloat.size();i++)
            System.out.println(arrListFloat.get(i));
    }
} 