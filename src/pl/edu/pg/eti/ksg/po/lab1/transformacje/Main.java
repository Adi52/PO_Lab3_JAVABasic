package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class Main {
    public static void main(String[] args) {
        Punkt pkt1 = new Punkt(2, -4.3);
        Punkt pkt2 = new Punkt(2, -4.3);

        System.out.println("Pobieranie X pkt1");
        System.out.println(pkt1.getX());

        System.out.println("Pobieranie Y pkt1");
        System.out.println(pkt1.getY());

        System.out.println("Drukowanie całego obiektu:");
        System.out.println(pkt1);

        System.out.println("Porównywanie referencji: pkt1 == pkt1");
        System.out.println(pkt1 == pkt1);

        System.out.println("Porównywanie referencji: pkt1 == pkt2");
        System.out.println(pkt1 == pkt2);

        System.out.println("Metoda equals: pkt1.equals(pkt1)");
        System.out.println(pkt1.equals(pkt1));

        System.out.println("Metoda equals: pkt1.equals(pkt2)");
        System.out.println(pkt1.equals(pkt2));

        System.out.println("Metoda hashCode: pkt1.hashCode()");
        System.out.println(pkt1.hashCode());

        System.out.println("Metoda hashCode: pkt2.hashCode()");
        System.out.println(pkt2.hashCode());
    }
}