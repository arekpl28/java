package ZadanieAdwance1;

/**
 * Rodzaje terenu na jakie mogą natknąć się uczestnicy biegu po lesie
 * 
 * @author TB
 */
public enum RodzajTerenu {
  /**
   * Teren po którym łatwo jest się porsuzać
   */
  DROGA,
  /**
   * Nieco mnie przebieżna niż {@link
   * pl.edu.pg.eti.ksg.po.lab2.biegpolesie.RodzajTerenu#DROGA}
   */
  SCIEZKA,
  /**
   * Teren w którym trzeba się ostrożnie pruszać
   */
  WYSOKI_LAS,
  /**
   * Teren trudny
   */
  NISKI_LAS,
  /**
   * Teren niebezpieczny, prawie niemożliwy do przebycia
   */
  BAGNO;
}
