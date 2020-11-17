package prmn_lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercize6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> sai = new ArrayList<>();
        int num = 5;
        for (int i = 0; i < num; i++) sai.add(new Integer());
        System.out.println("さいころを" + num + "個振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");
        Scanner input = new Scanner(System.in);
        try {
            int x;
            x = input.nextInt();
            System.out.println(x + "番目:" + sai.get(x).getN());
        }
        catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
