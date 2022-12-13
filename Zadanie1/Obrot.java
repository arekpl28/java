package Zadanie1;

import static java.lang.Math.*;

public class Obrot implements Transformacja {
  private final double alfa;

  public Obrot(double alfa) {
    this.alfa = alfa;
  }

  @Override
  public Transformacja getTransformacjaOdwrotna() {
    return new Obrot(-alfa);
  }

  @Override
  public Punkt transformuj(Punkt p) {
    double transformedX = (p.getX() * cos(alfa)) - (p.getY() * sin(alfa));
    double transformedY = (p.getX() * sin(alfa)) + (p.getY() * cos(alfa));
    return new Punkt(transformedX, transformedY);
  }

  @Override
  public String toString() {
    return "Obrot wzgledem (0,0) o " + alfa + " stopni";
  }

}
