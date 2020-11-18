package prmn_lecture07;

import java.util.ArrayList;
import java.util.List;

public class Monster {
    private String name;
    private int hitPoint, attack, block, speed;
    private List<Move> moveList = new ArrayList<>();

    public Monster(String name, int hitPoint, int attack, int block, int speed) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
    }

    public void addMove(Move move) {
        moveList.add(move);
    }

    public void attack(Monster enemy, int index) {
        AttackMove a = (AttackMove) moveList.get(index);
        a.attack(this, enemy);
    }

    public void showMove() {
        for (int i = 0; i < moveList.size(); i++) {
            System.out.println(i + ":" + moveList.get(i).getName());
        }
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public int getBlock() { return block; }

    public int getSpeed() {
        return speed;
    }

}
