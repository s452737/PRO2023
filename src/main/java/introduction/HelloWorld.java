package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    public static void main(String [ ] args) {

        Logger log = Logger.getLogger("name");

        System.out.println("Hello! Witaj!");

        log.info("message");
    }
}