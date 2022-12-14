package ZadanieAdwance2;

@FunctionalInterface
public interface SluchaczZdarzen {
  /*
   * Metoda interfejsu funkcjonalnego może mieć dowolną listę
   * parametrów oraz typ zwracany.
   */
  public void wystapiloZdarzenie(int priorytet, String nazwa);
}
