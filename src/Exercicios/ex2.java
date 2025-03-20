package Exercicios;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x;

        while (x < 1) {
            y = y + (x + 1);
            x--;
        }

        System.out.println(y);
    }
}
