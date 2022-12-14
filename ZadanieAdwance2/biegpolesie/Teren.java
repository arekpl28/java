package ZadanieAdwance2.biegpolesie;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TB
 */
class Teren implements ElementTrasy {

    private final RodzajTerenu rodzajTerenu;
    private Map<Uczestnik, Double> uczestnicyWTerenie = new HashMap<>();

    public Teren(RodzajTerenu rodzajTerenu) {
        this.rodzajTerenu = rodzajTerenu;
    }

    @Override
    public Iterable<Uczestnik> getUczestnicy() {
        return uczestnicyWTerenie.keySet();
    }

    public RodzajTerenu getRodzajTerenu() {
        return rodzajTerenu;
    }

    public Map<Uczestnik, Double> getUczestnicyWTerenie() {
        return uczestnicyWTerenie;
    }

    @Override
    public void dodajUczestnika(Uczestnik u) {
        uczestnicyWTerenie.put(u, 0.0);
    }

    @Override
    public void usunUczestnika(Uczestnik u) {
        uczestnicyWTerenie.remove(u);
    }

    @Override
    public int getLiczbaUczestnikowNaTrasie() {
        return uczestnicyWTerenie.size();
    }

}
