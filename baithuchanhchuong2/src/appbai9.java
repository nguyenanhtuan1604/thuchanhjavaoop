import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
public class Appbai9 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        out.println("Nhập chuỗi: ");

        String st=sc.nextLine();
        char ch;
        int demih=0, demit=0, demso=0;
        for(int i=0; i<st.length();i++){
            ch=st.charAt(i);
            int asciiValue=(int)ch;
            if(asciiValue >=48&& asciiValue<=57)
                demso++;
            else if(asciiValue >=65 && asciiValue <=90){
                demih++;
            }
            else if(asciiValue >=97 && asciiValue <=122){
                demit++;
            }
        }
        out.println("Số ký tự in hoa: "+ demih);
        out.println("Số ký tự in thường: "+ demit);
        out.println("Tổng số: "+demso);
    }
}