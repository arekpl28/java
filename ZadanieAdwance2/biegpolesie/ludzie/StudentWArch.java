package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;

public class StudentWArch extends StudentPolitechniki {

  public StudentWArch(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public void przedstawSie() {
    wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Kocham sztukę");
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    if (DziedzinaZadania.SZTUKA.equals(dziedzinaZadania)) {
      wypowiedzSie("Sztuka to moja pasja");
      return rozwiazanieZadaniaCzlowiek(0.7); // 70% szansy na rozwiązanie
    } else
      return rozwiazanieZadaniaCzlowiek(0.1);
  }
}
