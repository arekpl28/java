package ZadanieAdwance2.biegpolesie.ludzie;

import ZadanieAdwance2.biegpolesie.Czlowiek;

public class Student extends Czlowiek {

  public Student(String imie, String nazwisko, Plec plec) {
    super(imie, nazwisko, plec);
  }

  @Override
  public void przedstawSie() {
    wypowiedzSie("Cześć! Jestem " + getImie() + " " + getNazwisko()
        + ". Ma dwa razy większą szansę na rozwiązanie wszelkich zadań niż zwykły człowiek.");

  }

  @Override
  public boolean rozwiazanieZadaniaCzlowiek(double szansa) {
    return Math.random() < szansa * 2;
  }

}
