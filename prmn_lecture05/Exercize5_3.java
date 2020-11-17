package prmn_lecture05;

public class Exercize5_3 {
    public static void main(String[] args) {
        Butterfly fly = new Butterfly();
        Insect insect = fly;
        insect.move();
    }
}
