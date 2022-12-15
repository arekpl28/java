package ZadanieAdwance2.biegpolesie.roboty;

import ZadanieAdwance2.biegpolesie.DziedzinaZadania;
import ZadanieAdwance2.biegpolesie.Robot;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

/**
 *
 * @author TB
 */
public class RobotMobilny extends Robot {

    public RobotMobilny(int numerSeryjny) {
        super("Robot mobilny typ A", numerSeryjny);
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        switch (rodzajTerenu) {
            case DROGA:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Rozwijanie maksymalnej prędkości.");
                return czynnikiLosowe.nextDouble() * 0.1 + 0.95; // Od 0.95 do 1.5
            case SCIEZKA:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Prędkość umiarkowana.");
                return czynnikiLosowe.nextDouble() * 0.1 + 0.85; // Od 0.85 do 0.95
            case WYSOKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Nieprzyjazne warunki.");
                return czynnikiLosowe.nextDouble() * 0.1 + 0.4; // Od 0.4 do 0.5
            case NISKI_LAS:
                komunikuj("Wykryto teren: " + rodzajTerenu + ". Wykryto znaczną liczbę przeszkód.");
                return czynnikiLosowe.nextDouble() * 0.2 + 0.2; // Od 0.2 do 0.4
            case BAGNO:
            default:
                komunikuj("Wykryto teren: " + rodzajTerenu + ".");
                komunikuj("Awaria silników!");
                return czynnikiLosowe.nextDouble() * 0.1; // Od 0.0 do 0.1
        }
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        switch (dziedzinaZadania) {
            case MATEMATYKA:
                komunikuj("Wykryto zadanie z: " + dziedzinaZadania + ". Bardzo słabo sobie z tym radzę.");
                return rozwiazanieZadaniaRobot(0.05); // 5% szansy na rozwiązanie zadania
            case FIZYKA:
                komunikuj("Wykryto zadanie z: " + dziedzinaZadania + ". Będzie ciężko.");
                return rozwiazanieZadaniaRobot(0.05); // 5% szansy na rozwiązanie zadania
            case INFORMATYKA:
                komunikuj("Wykryto zadanie z: " + dziedzinaZadania + ". Przegrzanie stytemu.");
                return rozwiazanieZadaniaRobot(0.05); // 5% szansy na rozwiązanie zadania
            case SZTUKA:
                komunikuj("Wykryto zadanie z: " + dziedzinaZadania + ". Masakra.");
                return rozwiazanieZadaniaRobot(0.05); // 5% szansy na rozwiązanie zadania
            case NAUKI_LESNE:
            default:
                komunikuj("Wykryto zadanie z: " + dziedzinaZadania + ".");
                komunikuj("Awaria silników!");
                return rozwiazanieZadaniaRobot(0.05); // 5% szansy na rozwiązanie zadania
        }
    }

}
