package ua.hille.lesson12.logger;

import ua.hille.lesson12.logger.Logger;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class LoggerTest {
  public static void main(String[] args) {
    Logger logger = new Logger();

    logger.debug("I'm debug message");
    logger.info("And I'm info message, ignore me");
    logger.warn("Wow, that an Warning message, look at me");
    logger.error("It's an error, you are busted!");
  }
}
