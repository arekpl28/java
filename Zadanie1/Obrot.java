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
    double alfaR = (alfa * PI) / 180.0;
    double transformedX = (p.getX() * cos(alfaR)) - (p.getY() * sin(alfaR));
    double transformedY = (p.getX() * sin(alfaR)) + (p.getY() * cos(alfaR));
    return new Punkt(transformedX, transformedY);
  }

  @Override
  public String toString() {
    return "Obrot wzgledem (0,0) o " + alfa + " stopni";
  }

}
