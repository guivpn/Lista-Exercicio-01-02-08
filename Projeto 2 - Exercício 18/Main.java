import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

class Main {
  public static boolean ValidarData(String novaData) {
    try {
      LocalDate.parse(novaData, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
      return true;
    } catch (DateTimeParseException e) {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe uma data no formato 'dd/MM/yyyy': ");
    String novaData = teclado.nextLine();

    teclado.close();
      
    if(ValidarData(novaData)) {
      System.out.println("A data é válida! ");
    } else {
      System.out.println("A data é inválida! ");
    }
  }
}