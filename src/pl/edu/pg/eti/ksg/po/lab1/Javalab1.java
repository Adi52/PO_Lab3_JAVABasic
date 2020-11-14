package pl.edu.pg.eti.ksg.po.lab1;

import pl.edu.pg.eti.ksg.po.lab1.transformacje.Translacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Skalowanie;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.BrakTransformacjiOdwrotnejException;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Punkt;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Transformacja;
import pl.edu.pg.eti.ksg.po.lab1.transformacje.Obrot;


public class Javalab1 {
    public static void main(String[] args)
    {
//        -- Zad 1 ---

//        Punkt pkt1 = Punkt.E_X;
//        Punkt pkt2 = Punkt.E_X;
//
//        System.out.println("Pobieranie X pkt1");
//        System.out.println(pkt1.getX());
//
//        System.out.println("Pobieranie Y pkt1");
//        System.out.println(pkt1.getY());
//
//        System.out.println("Drukowanie całego obiektu:");
//        System.out.println(pkt1);
//
//        System.out.println("Porównywanie referencji: pkt1 == pkt1");
//        System.out.println(pkt1 == pkt1);
//
//        System.out.println("Porównywanie referencji: pkt1 == pkt2");
//        System.out.println(pkt1 == pkt2);
//
//        System.out.println("Metoda equals: pkt1.equals(pkt1)");
//        System.out.println(pkt1.equals(pkt1));
//
//        System.out.println("Metoda equals: pkt1.equals(pkt2)");
//        System.out.println(pkt1.equals(pkt2));
//
//        System.out.println("Metoda hashCode: pkt1.hashCode()");
//        System.out.println(pkt1.hashCode());
//
//        System.out.println("Metoda hashCode: pkt2.hashCode()");
//        System.out.println(pkt2.hashCode());

//        --- Zad 2 ---

        try {
            Punkt p1 = Punkt.E_X;
            System.out.println(p1);
            Transformacja tr = new Translacja(5, 6);
            System.out.println(tr);
            Punkt p2 = tr.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);

        } catch (BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr2 = new Skalowanie(5, 4);
            System.out.println(tr2);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            Transformacja tr2 = new Skalowanie(5, 0);
            System.out.println(tr2);
            System.out.println(p1);
            Punkt p2 = tr2.transformuj(p1);
            System.out.println(p2);
            // // Tutaj try wyłapało błąd, ponieważ chcemy dzielić przez 0 (1/0).
            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
            System.out.println(trr2);
            Punkt p3 = trr2.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        //        --- Zad 3 ---

        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr3 = new Obrot(24.3);
            System.out.println(tr3);
            Punkt p2 = tr3.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr3.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

        try
        {
            Punkt p1 = new Punkt(2, 2);
            System.out.println(p1);
            Transformacja tr3 = new Obrot(0);
            System.out.println(tr3);
            Punkt p2 = tr3.transformuj(p1);
            System.out.println(p2);
            Transformacja trr = tr3.getTransformacjaOdwrotna();
            System.out.println(trr);
            Punkt p3 = trr.transformuj(p2);
            System.out.println(p3);
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();

    }
}

