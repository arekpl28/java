package ZadanieAdwance2.biegpolesie;

import java.util.Arrays;
import java.util.Objects;

public class FabrykaElementowTrasy {
  static public ElementTrasy utworzElementTrasy(DziedzinaZadania zadanie) {
    return new Zadanie(zadanie);
  }

  public static ElementTrasy utworzElementTrasy(RodzajTerenu teren) {
    return new Teren(teren);
  }

  static public ElementTrasy utworzElementTrasy(String enumValue) {
    DziedzinaZadania dziedzinaZadania = sprwadzDziedzinaZadania(enumValue);
    RodzajTerenu rodzajTerenu = sprawdzRodzajTerenu(enumValue);
    if (Objects.nonNull(dziedzinaZadania)) {
      return new Zadanie(dziedzinaZadania);
    } else if (Objects.nonNull(rodzajTerenu)) {
      return new Teren(rodzajTerenu);
    } else
      throw new IllegalArgumentException();
  }

  private static RodzajTerenu sprawdzRodzajTerenu(String enumValue) {
    return Arrays.stream(RodzajTerenu.values())
        .filter(e -> e.getName().equals(enumValue.toLowerCase()))
        .findFirst()
        .orElse(null);
  }

  private static DziedzinaZadania sprwadzDziedzinaZadania(String enumValue) {
    return Arrays.stream(DziedzinaZadania.values())
        .filter(e -> e.getName().equals(enumValue.toLowerCase()))
        .findFirst()
        .orElse(null);
  }
}
