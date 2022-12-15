package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.Czlowiek;
import ZadanieAdwance2.biegpolesie.DziedzinaZadania;
import ZadanieAdwance2.biegpolesie.RodzajTerenu;

/**
 *
 * @author TB
 */
public class BagiennyBiegacz extends Czlowiek {

    public BagiennyBiegacz(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec);
    }

    @Override
    public void przedstawSie() {
        wypowiedzSie(
                "Cześć! Jestem " + getImie() + " " + getNazwisko() + ". Moją ulubioną rośliną jest mech bagienny.");
    }

    @Override
    public double predkoscPoruszaniaSie(RodzajTerenu rodzajTerenu) {
        if (RodzajTerenu.BAGNO.equals(rodzajTerenu)) {
            wypowiedzSie(
                    "Generalnie dobrze się idzie. Tylko trzeba stopy stawiać na tym bardziej suchym, twardszym mchu.");
            return humorIUwarunkowaniaOsobiste.nextDouble() * 0.2 + 0.2; // Od 0.2 do 0.4
        } else
            return Math.min(1.0, super.predkoscPoruszaniaSie(rodzajTerenu) * 1.1);
    }

    @Override
    public boolean rozwiazZadanie(DziedzinaZadania dziedzinaZadania) {
        if (DziedzinaZadania.NAUKI_LESNE.equals(dziedzinaZadania)) {
            wypowiedzSie(
                    "Całkiem dobrze mi to idzie.");
            return rozwiazanieZadaniaCzlowiek(0.6); // 60% szansy na rozwiązanie
        } else
            return rozwiazanieZadaniaCzlowiek(0.1);
    }

}
