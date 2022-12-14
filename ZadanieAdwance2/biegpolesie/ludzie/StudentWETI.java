package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;

public class StudentWETI extends StudentPolitechniki {

  public StudentWETI(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public void przedstawSie() {
    wypowiedzSie(
        "Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Uwielbiam informatyke :-)");
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    if (DziedzinaZadania.INFORMATYKA.equals(dziedzinaZadania)) {
      wypowiedzSie(
          "Zadania z informatyki rozwiązuję niemal że bezbłędnie!!!");
      return rozwiazanieZadaniaCzlowiek(0.99); // 99% szansy na rozwiązanie
    } else
      return rozwiazanieZadaniaCzlowiek(0.1);
  }
}
