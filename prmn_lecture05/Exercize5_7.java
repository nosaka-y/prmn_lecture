package prmn_lecture05;

public class Exercize5_7 {
    public static void main(String[] args) {
        Insect[] insect = new Insect[4];
        insect[0] = new Insect();
        insect[1] = new Butterfly();
        insect[2] = new Locust();
        insect[3] = new SwallowtailButterfly();

        for (Insect i : insect) {
            i.move();
        }
    }
}
