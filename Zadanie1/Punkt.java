package Zadanie1;

public class Punkt {
  /*
   * Słowo kluczowe final oznacza, że po pierwszym przypisaniu
   * zawartość pól x oraz y nie może zostać zmieniona
   * w tym miejscu jest to odpowiednik słowa kluczowego const
   * z języka C++.
   */
  private final double x, y;

  public Punkt(double x, double y) {
    /*
     * TODO
     */
    this.x = x;
    this.y = y;
  }

  public double getX() {
    /*
     * TODO
     */
    return x;
  }

  public double getY() {
    /*
     * TODO
     */
    return y;
  }

  @Override
  public boolean equals(Object obj) {
    /*
     * TODO
     */
    if (obj instanceof Punkt) {
      Punkt other = (Punkt) obj;
      return x == other.x;
    }
    return false;
  }

  @Override
  public int hashCode() {
    /*
     * TODO
     */
    return 59 * Double.hashCode(x) + 7;
  }

  @Override
  public String toString() {
    /*
     * TODO
     */
    return "Instancja klasy Punkt zawierająca liczby: " + x + ", " + y;
  }

  /*
   * Początek układu współrzędnych.
   * W tym miejscu słowo kluczowe final oznacza, że statyczne
   * pole klasy Punkt nie może zostać zmienione.
   * Dotyczy to jednak samej referencji, a nie obiektu, na który
   * wskazuje.
   */
  public static final Punkt O = new Punkt(0, 0);
  /*
   * Punkt (1,0) w układzie współrzędnych
   */
  public static final Punkt E_X = new Punkt(1, 0);
  /*
   * Punkt (0,1) w układzie współrzędnych
   */
  public static final Punkt E_Y = new Punkt(0, 1);
}
