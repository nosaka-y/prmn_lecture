package prmn_lecture07;

import java.util.Scanner;
import java.util.function.Supplier;

public class Exercize7_1 {
    public static void main(String[] args) {
        Supplier<Monster> turtle = () -> {
            Monster t = new Monster("turtle", 55, 17, 16, 15);
            t.addMove(new AttackMove("tackle", 10));
            t.addMove(new AttackMove("razorLeaf", 12));
            System.out.println("turtleを生成しました。");
            return t;
        };

        Supplier<Monster> monkey = () -> {
            Monster m = new Monster("monkey", 44, 14, 11, 31);
            m.addMove(new AttackMove("scratch", 10));
            m.addMove(new AttackMove("tackle", 10));
            m.addMove(new AttackMove("ember", 10));
            System.out.println("monkeyを生成しました。");
            return m;
        };

        Supplier<Monster> penguin = () -> {
            Monster p = new Monster("penguin", 53, 12, 13, 20);
            p.addMove(new AttackMove("peck", 15));
            p.addMove(new AttackMove("tackle", 10));
            p.addMove(new AttackMove("bubble", 10));
            System.out.println("penguinを生成しました。");
            return p;
        };

        System.out.print("select your monster(0~2):");
        Scanner input = new Scanner(System.in);
        int sel = input.nextInt();
        Monster player = null;
        switch(sel) {
            case 0:
                player = turtle.get();
                break;
            case 1:
                player = monkey.get();
                break;
            case 2:
                player = penguin.get();
                break;
            default:
                System.exit(0);
        }
        System.out.print("select enemy monster(0~2):");
        sel = input.nextInt();
        Monster enemy = null;
        switch(sel) {
            case 0:
                enemy = turtle.get();
                break;
            case 1:
                enemy = monkey.get();
                break;
            case 2:
                enemy = penguin.get();
                break;
            default:
                System.exit(0);
        }

        Field f = new Field(player, enemy);
        f.battleStart();
    }
}
