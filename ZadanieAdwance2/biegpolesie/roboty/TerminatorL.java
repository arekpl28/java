package ZadanieAdwance2.biegpolesie.roboty;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

public class TerminatorL extends Terminator {

  public TerminatorL(String model, int numerSeryjny) {
    super(" Niewielka seria T-101L", numerSeryjny);
  }

  @Override
  public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
    if (RodzajTerenu.NISKI_LAS.equals(rodzajTerenu) && RodzajTerenu.WYSOKI_LAS.equals(rodzajTerenu)) {
      komunikuj("posiada większą sprawność w poruszaniu się w niskim lesie jak i wysokim lesie.");
      return czynnikiLosowe.nextDouble() * 0.1 + 0.85; // Od 0.2 do 1.0
    } else
      return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    if (DziedzinaZadania.NAUKI_LESNE.equals(dziedzinaZadania)) {
      komunikuj(
          "Zadania z Fizyki rozwiązuję przewaznie dobrze :-)");
      return rozwiazanieZadaniaRobot(0.7); // 70% szansy na rozwiązanie
    } else
      return rozwiazanieZadaniaRobot(0.1);
  }
}
