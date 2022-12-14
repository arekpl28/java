package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;

public class StudentPolitechniki extends Student {

  public StudentPolitechniki(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public void przedstawSie() {
    wypowiedzSie(
        "Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Lubię imprezy :-)");
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    if (DziedzinaZadania.FIZYKA.equals(dziedzinaZadania)) {
      wypowiedzSie(
          "Zadania z Fizyki rozwiązuję raz dobrze a raz źle :-)");
      return rozwiazanieZadaniaCzlowiek(0.5); // 50% szansy na rozwiązanie
    } else if (DziedzinaZadania.MATEMATYKA.equals(dziedzinaZadania) && DziedzinaZadania.INFORMATYKA
        .equals(dziedzinaZadania)) {
      wypowiedzSie("Matematyka oraz informatyka idzie mi nawet dobrze");
      return rozwiazanieZadaniaCzlowiek(0.7); // 70% szansy na rozwiązanie
    } else
      return rozwiazanieZadaniaCzlowiek(0.1);
  }
}
