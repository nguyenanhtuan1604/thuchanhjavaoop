//baithuchanh2802

import java.util.Scanner;

public class App11 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int i, j, k, sl = 0;
        for (i = 0; i <= 200; ++i)
            for (j = 0; j <= 100; ++j)
                for (k = 0; k <= 40; ++k)
                    if (i * 1000 + j * 2000 + k * 5000 == 200000)
                    {
                       //System.out.print(i +  " to 1000, " + j + " to 2000, " + k + " to 5000.");
                        sl++;
                    }
        System.out.print("Co tat ca " + sl + " cach chon!");
                }
            }
        
