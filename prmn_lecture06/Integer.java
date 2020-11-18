package prmn_lecture06;

import java.util.Random;

public class Integer {
    private int n;

    public Integer() {
        Random ran = new Random();
        n = ran.nextInt(6)+1;
    }

    public int getN() {
        return n;
    }
}
