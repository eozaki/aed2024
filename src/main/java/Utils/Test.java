package Utils;

import java.util.Objects;

public class Test {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_GREEN = "\033[0;32m";

  public static void assertEquals(Object givenValue, Object expectedValue) {
    if(Objects.equals(givenValue, expectedValue) || givenValue == expectedValue) {
      System.out.println(ANSI_GREEN + "Ok: (dado) " + givenValue.toString() + " == " + expectedValue + " (esperado);" + ANSI_RESET);
    } else {
      System.out.println(ANSI_RED + "Alguma coisa deu errado, nos foi dado " + givenValue + " enquanto esperávamos " + expectedValue + ";" + ANSI_RESET);
    }
  }
}
