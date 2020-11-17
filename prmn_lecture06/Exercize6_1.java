package prmn_lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercize6_1 {
    public static void main(String[] args) {
        System.out.println("小数値を入力してください:");
        Scanner input = new Scanner(System.in);
        double d;
        try {
            d = input.nextDouble();
            System.out.println("入力した値: " + d);
        }
        catch(InputMismatchException e) {
            System.out.println("エラー.");
        }
    }
}
