package Zadanie;

public class Javalab1 {
  public static void main(String[] args) {
    B b = new B(2.5);
    System.out.println("Pobieranie liczby:");
    System.out.println(b.getLiczba());
    System.out.println("Drukowanie całego obiektu:");
    System.out.println(b);
    b.setLiczba(3.14);
    System.out.println("Drukowanie całego obiektu po ustawieniu liczby:");
    System.out.println(b);

    B b1 = new B(3.14);
    System.out.println("Porównywanie referencji: b == b");
    System.out.println(b == b);
    System.out.println("Porównywanie referencji: b == b1");
    System.out.println(b == b1);
    System.out.println("Metoda equals: b.equals(b)");
    System.out.println(b.equals(b));
    System.out.println("Metoda equals: b.equals(b1)");
    System.out.println(b.equals(b1));
    System.out.println("Metoda hashCode: b.hashCode()");
    System.out.println(b.hashCode());
    System.out.println("Metoda hashCode: b1.hashCode()");
    System.out.println(b1.hashCode());
  }
}