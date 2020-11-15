package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Obrot implements Transformacja {
    private final double stopnie, radiany;

    public Obrot(double stopnie) {
      this.stopnie = stopnie;
      this.radiany = Math.toRadians(stopnie);
    }

    @Override
    public Transformacja getTransformacjaOdwrotna() {
        return new Obrot(-stopnie);
    }

    @Override
    public Punkt transformuj(Punkt p) {
        return new Punkt(p.getX() * Math.cos(radiany) - p.getY() * Math.sin(radiany), p.getX() * Math.sin(radiany) + p.getY() * Math.cos(radiany));
    }

    public double getRadiany() {
        return radiany;
    }

    @Override
    public String toString() {
        return "Obrot punktu wokol punktu (0, 0) o " + stopnie + " stopni";
    }

}
