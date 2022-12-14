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
        komunikuj("Wykryto teren: " + dziedzinaZadania + ". Rozwijanie maksymalnej prędkości.");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case FIZYKA:
        komunikuj("Wykryto teren: " + dziedzinaZadania + ". Prędkość umiarkowana.");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case INFORMATYKA:
        komunikuj("Wykryto teren: " + dziedzinaZadania + ". Nieprzyjazne warunki.");
        return rozwiazanieZadaniaRobot(1); // 100% szansy na rozwiązanie zadania
      case SZTUKA:
        komunikuj("Wykryto teren: " + dziedzinaZadania + ". Wykryto znaczną liczbę przeszkód.");
        return rozwiazanieZadaniaRobot(0); // 0% szansy na rozwiązanie zadania
      case NAUKI_LESNE:
      default:
        komunikuj("Wykryto teren: " + dziedzinaZadania + ".");
        komunikuj("Awaria silników!");
        return rozwiazanieZadaniaRobot(0); // 0% szansy na rozwiązanie zadania
    }
  }

}
