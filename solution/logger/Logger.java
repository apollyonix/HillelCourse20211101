package ua.hille;

public class Logger {
  private static String RESET = "\u001B[0m";
  private static String BLUE = "\u001B[34m";
  private static String GREEN = "\u001B[32m";
  private static String YELLOW = "\u001B[33m";
  private static String RED = "\u001B[31m";

  public void info(String message) {
    printMessage(BLUE, LogLevel.INFO, message);
  }

  public void debug(String message) {
    printMessage(GREEN, LogLevel.DEBUG, message);
  }

  public void warn(String message) {
    printMessage(YELLOW, LogLevel.WARN, message);
  }

  public void error(String message) {
    printMessage(RED, LogLevel.ERROR, message);
  }

  private void printMessage(String color, LogLevel level,  String message) {
    System.out.println(color + level + ": " + RESET + message);
  }
}