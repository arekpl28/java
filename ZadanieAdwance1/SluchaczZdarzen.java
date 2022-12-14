package ZadanieAdwance1;

/*
* Adnotacja @FunctionalInterface została wprowadzona w Javie 8.
* Służy ona do oznaczania interfejsów z jedną metodą. Na takie
* interfejsy mogą zostać przekonwertowane lambda wyrażenia oraz metody
* mające taką samą listę argumentów oraz typ zwracany.
*/
@FunctionalInterface
public interface SluchaczZdarzen {
  /*
   * Metoda interfejsu funkcjonalnego może mieć dowolną listę
   * parametrów oraz typ zwracany.
   */
  public void wystapiloZdarzenie(int priorytet, String nazwa);
}