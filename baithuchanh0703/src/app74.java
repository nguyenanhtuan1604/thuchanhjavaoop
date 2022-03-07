import java.util.Scanner;
public class App74 {
    public static void main (String[] agrs){
        Scanner p = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("arr["+i+"]");
            arr[i]=p.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)sum+=arr[i];
        }
        System.out.println("tong phan tu chan trong mang: "+sum);
    }