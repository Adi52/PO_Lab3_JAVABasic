package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import java.util.Arrays;

public class ZlozenieTransformacji implements Transformacja {
    private final Transformacja[] transformacje;

    public ZlozenieTransformacji(Transformacja[] transformacje) {
        this.transformacje = transformacje;
    }

    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        for (int i = 0; i < transformacje.length; i++) {
            transformacje[i] = transformacje[i].getTransformacjaOdwrotna();
        }
        return new ZlozenieTransformacji(transformacje);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        for (int i = 0; i < transformacje.length; i++) {
            p = transformacje[i].transformuj(p);
        }
        return p;
    }

    @Override
    public String toString() {
        return "Wykonano zlozenie transformacji " + Arrays.toString(transformacje);
    }
}
