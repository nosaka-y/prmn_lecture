package prmn_lecture07;

public class AttackMove extends Move{
    private int power;

    public AttackMove(String name, int power) {
        super(name);
        this.power = power;
    }

    public void attack(Monster monster, Monster enemy) {
        System.out.println("\n" + monster.getName() + " の " + getName() + " !!");
        int damage = monster.getAttack() + power - enemy.getBlock();
        int enemyHP = enemy.getHitPoint();
        System.out.println(enemy.getName() + " HP " + enemyHP + " → " + (enemyHP - damage) + "\n");
        enemy.setHitPoint(enemyHP - damage);
    }
}
