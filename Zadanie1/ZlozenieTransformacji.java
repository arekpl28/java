package Zadanie1;

public class ZlozenieTransformacji implements Transformacja {
  private Transformacja[] transformacje;

  public ZlozenieTransformacji(Transformacja[] transformacje) {
    this.transformacje = transformacje;
  }

  @Override
  public Transformacja getTransformacjaOdwrotna() throws BrakTransformacjiOdwrotnejException {
    throw new BrakTransformacjiOdwrotnejException("Cannot return complete return transformation with one object.");

  }

  @Override
  public Punkt transformuj(Punkt p) {

    Punkt output = p;
    for (Transformacja t : transformacje) {
      output = t.transformuj(output);
    }

    return output;
  }

}