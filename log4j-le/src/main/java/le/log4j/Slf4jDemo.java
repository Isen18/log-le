package le.log4j;


import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Isen
 * @date 2019/1/18 17:39
 * @since 1.0
 */
public class Slf4jDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jDemo.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println("line=" + line);
            LOGGER.debug("debug.line={}", line);
            LOGGER.info("info.line={}", line);
        }
    }
}
