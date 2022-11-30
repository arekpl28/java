package Java02_Scanner;

import java.util.Scanner;

public class Scanner_input {

  public static void main(String[] args) {
    System.out.println("Wprowadź ocene");

    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();

    System.out.println("Wprowadzona ocena to: " + input);

    switch (input) {
      case 1:
        System.out.println("Czemu tak malo tylko 1!");
        break;
      case 2:
        System.out.println("Troszke lepiej 2!");
        break;
      case 3:
        System.out.println("Nie jest za dobrze 3!");
        break;
      case 4:
        System.out.println("Jest dobrze 4!");
        break;
      case 5:
        System.out.println("Jeste najlepiej 5!");
        break;

      default:
        break;
    }

  }

}
