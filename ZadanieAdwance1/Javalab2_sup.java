package ZadanieAdwance1;

import java.util.LinkedList;
import java.util.List;

public class Javalab2_sup {
  public static void main(String[] args) {
    ZwyklaKlasa instancjaA = new ZwyklaKlasa();
    ZwyklaKlasa instancjaB = new ZwyklaKlasa();
    List<SluchaczZdarzen> listaSluchaczy = new LinkedList<>();
    listaSluchaczy.add(instancjaA.klasaWewnetrzna());
    listaSluchaczy.add(instancjaA.statycznaKlasaWewnetrzna());
    listaSluchaczy.add(instancjaA.klasaAnonimowa());

    listaSluchaczy.add(instancjaB.wyrazenieLambda());
    /**
     * Wprowadzone w Javie 8. Pozwala przekonwertować metodę obiektu
     * na klasę implementującą interfejs funkcjonalny.
     */
    listaSluchaczy.add(instancjaB::zwyklaMetoda);
    /**
     * Wprowadzone w Javie 8. Pozwala przekonwertować metodę
     * statyczną na klasę implementującą interfejs funkcjonalny
     */
    listaSluchaczy.add(ZwyklaKlasa::zwyklaStatycznaMetoda);
    String nazwa = "Test Interfejsów";
    int priorytet = 8;
    for (SluchaczZdarzen sl : listaSluchaczy) {
      sl.wystapiloZdarzenie(priorytet, nazwa);
    }
  }
}
