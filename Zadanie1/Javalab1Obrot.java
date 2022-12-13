package Zadanie1;

public class Javalab1Obrot {
  public static void main(String[] args) {

    try {
      // Punkt p1 = Punkt.E_X;
      Punkt p1 = new Punkt(2, 4);
      Transformacja tr = new Obrot(30);
      Punkt p2 = tr.transformuj(p1);
      Transformacja trr = tr.getTransformacjaOdwrotna();
      Punkt p3 = trr.transformuj(p2);

      System.out.println(p1);
      System.out.println(tr);
      System.out.println(p2);
      System.out.println(trr);
      System.out.println(p3);

    } catch (BrakTransformacjiOdwrotnejException ex) {
      ex.printStackTrace();
    }
  }
}
