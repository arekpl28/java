package ZadanieAdwance2.biegpolesie;

public enum DziedzinaZadania {

  MATEMATYKA("matematyka"),
  FIZYKA("fizyka"),
  INFORMATYKA("informatyka"),
  SZTUKA("sztuka"),
  NAUKI_LESNE("nauki lesne");

  private final String name;

  public String getName() {
    return name;
  }

  DziedzinaZadania(String name) {
    this.name = name;
  }

}
