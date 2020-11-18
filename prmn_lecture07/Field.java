package prmn_lecture07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Field {
    private List<Monster> monsterList = new ArrayList<>();

    public Field(Monster monster1, Monster monster2) {
        monsterList.add(monster1);
        monsterList.add(monster2);
    }

    public void battleStart() {
        Monster p = monsterList.get(0);
        Monster e = monsterList.get(1);
        Runnable playerTurn = () -> {
            p.showMove();
            System.out.print("select method of attack:");
            int waza;
            Scanner input = new Scanner(System.in);
            waza = input.nextInt();
            p.attack(e, waza);

        };
        Runnable enemyTurn = () -> {
            Random ran = new Random();
            e.attack(p, ran.nextInt(3));
        };
        if (p.getSpeed() < e.getSpeed()) {
            enemyTurn.run();
        }
        while(true) {
            if(!p.isAlive()) {
                System.out.println("あなたのまけ");
                break;
            }
            playerTurn.run();
            if(!e.isAlive()) {
                System.out.println("あなたのかち");
                break;
            }
            enemyTurn.run();

        }
    }
}
