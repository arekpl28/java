package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

public class StudentWETIOrazLesnik extends StudentWETI {

  public StudentWETIOrazLesnik(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
    if (RodzajTerenu.NISKI_LAS.equals(rodzajTerenu)) {
      wypowiedzSie("posiada większą sprawność w poruszaniu się w niskim lesie.");
      return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.6; // Od 0.2 do 0.8
    } else
      return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    if (DziedzinaZadania.NAUKI_LESNE.equals(dziedzinaZadania)) {
      wypowiedzSie(
          "Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
      return rozwiazanieZadaniaCzlowiek(0.8); // 80% szansy na rozwiązanie
    } else
      return rozwiazanieZadaniaCzlowiek(0.1);
  }
}
