package Zadanie1;

public interface Transformacja {
  Punkt transformuj(Punkt p);

  Transformacja geTransformacjaOdwrotna()
      throws BrakTransformacjiOdwrotnejException;
}
