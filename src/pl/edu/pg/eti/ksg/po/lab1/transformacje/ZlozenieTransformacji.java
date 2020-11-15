package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import java.util.Arrays;

public class ZlozenieTransformacji implements Transformacja {
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji(Transformacja[] transformacje) {
        this.transformacje = transformacje;
    }

    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        Transformacja[] transformacjeKopia = transformacje.clone();
        for (int i = 0; i < transformacje.length; i++) {
            System.out.println(transformacje.length - i -1);
            transformacje[i] = transformacjeKopia[transformacje.length - i -1].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(transformacje);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        for (Transformacja transformacja : transformacje) {
            p = transformacja.transformuj(p);
        }
        return p;
    }

    @Override
    public String toString() {
        return "Wykonano zlozenie transformacji " + Arrays.toString(transformacje);
    }
}
