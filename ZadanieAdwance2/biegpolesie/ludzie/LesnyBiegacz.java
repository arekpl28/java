package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.Czlowiek;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

public class LesnyBiegacz extends Czlowiek {

  public LesnyBiegacz(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public void przedstawSie() {
    wypowiedzSie(
        "Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Moją ulubioną rośliną jest konopia indyjska :-)");
  }

  @Override
  public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
    if (RodzajTerenu.NISKI_LAS.equals(rodzajTerenu) && RodzajTerenu.WYSOKI_LAS.equals(rodzajTerenu)) {
      wypowiedzSie("posiada większą sprawność w poruszaniu się w niskim lesie jak i wysokim lesie.");
      return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.8; // Od 0.2 do 1.0
    } else
      return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
  }

}
