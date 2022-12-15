package ZadanieAdwance2.biegpolesie;

public enum RodzajTerenu {

  DROGA("droga"),
  SCIEZKA("sciezka"),
  WYSOKI_LAS("wysoki las"),
  NISKI_LAS("niski las"),
  BAGNO("bagno");

  private final String name;

  public String getName() {
    return name;
  }

  RodzajTerenu(String name) {
    this.name = name;
  }
}
