package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja {
    private final double stopnie;

    public Obrot(double stopnie) {
      this.stopnie = stopnie;
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
        if(stopnie == 0) throw new BrakTransformacjiOdwrotnejException("Brak transformacji odwrotnej. Stopnie obrotu równe 0");
        return new Obrot(1/stopnie);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(p.getX() * Math.cos(stopnie) - p.getY() * Math.sin(stopnie), p.getX() * Math.sin(stopnie) + p.getY() * Math.cos(stopnie));
    }

    public double getStopnie() {
        return stopnie;
    }


    @Override
    public String toString() {
        return "Obrot punktu wokol punktu (0, 0) o " + stopnie + " stopni";
    }

}
