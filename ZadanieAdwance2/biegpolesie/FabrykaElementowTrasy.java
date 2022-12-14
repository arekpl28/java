package ZadanieAdwance2.biegpolesie;

public class FabrykaElementowTrasy {
  static public ElementTrasy utworzElementTrasy(Object obj) {
    // DziedzinaZadania dziedzinaZadania
    if (obj instanceof DziedzinaZadania) {
      DziedzinaZadania z = (DziedzinaZadania) obj;
      return new Zadanie(z);
    } else {
      RodzajTerenu t = (RodzajTerenu) obj;
      return new Teren(t);
    }
    // throw new Exception("Złe coś tam coś tam");

  }

}
