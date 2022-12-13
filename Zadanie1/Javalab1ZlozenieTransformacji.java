package Zadanie1;

public class Javalab1ZlozenieTransformacji {
  public static void main(String[] args) {

    Transformacja[] transformacje = { new Skalowanie(2, 2), new Translacja(3, 3) };

    Punkt p1 = Punkt.E_X;
    Transformacja tr = new ZlozenieTransformacji(transformacje);
    Punkt p2 = tr.transformuj(p1);

    System.out.println(p1);
    System.out.println(tr);
    System.out.println(p2);

  }
}
