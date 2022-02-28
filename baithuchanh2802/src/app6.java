import java.util.Scanner;
public class App6 {
    public static boolean soHH(int a){
        int sum = 0;
        for(int i=1;sum<=a && i < a; i++){
            if(a%i==0) 
              sum+=i;
    if(sum == a)
        return true;
        }return false;
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.print("Nhap vao so can xet a = ");
    a = sc.nextInt();
    System.out.printf("Cac so hoan hao nho hon %d la :", a);
    App6 dt = new App6 ();
   for(int i =1; i <= a; i++){
       if(dt.soHH(i)){
           System.out.print(" " + i);
       }
   }
  }
}