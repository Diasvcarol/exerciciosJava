package Exercicios;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = num1;

        while (num1 > 1) {
            num2 = num2 * (num1-1);
            num1--;
        }

        System.out.println(num2);
    }
}
