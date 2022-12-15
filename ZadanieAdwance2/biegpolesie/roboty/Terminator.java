package ZadanieAdwance2.biegpolesie.roboty;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;
import ZadanieAdwance2.biegpolesie.Robot;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

public class Terminator extends Robot {

  public Terminator(String model, int numerSeryjny) {
    super("Zwyczajny robot z serii T-101", numerSeryjny);
  }

  @Override
  public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
    return czynnikiLosowe.nextDouble() * 0.3;
  }

  @Override
  public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
    switch (dziedzinaZadania) {
      case MATEMATYKA:
        komunikuj("Wykryto zadanie z:  " + dziedzinaZadania + ". Prościzna");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case FIZYKA:
        komunikuj("Wykryto zadanie z:  " + dziedzinaZadania + ". Dla mnie to Pestka");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case INFORMATYKA:
        komunikuj("Wykryto zadanie z:  " + dziedzinaZadania + ". Luzik.");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case SZTUKA:
        komunikuj("Wykryto zadanie z:  " + dziedzinaZadania + ". Będzie problem.");
        return rozwiazanieZadaniaRobot(0.1); // 10% szansy na rozwiązanie zadania
      case NAUKI_LESNE:
      default:
        komunikuj("Wykryto zadanie z:  " + dziedzinaZadania + ".");
        komunikuj("Zwarcie w obwodzie!!");
        return rozwiazanieZadaniaRobot(0.1); // 10% szansy na rozwiązanie zadania
    }
  }

}
