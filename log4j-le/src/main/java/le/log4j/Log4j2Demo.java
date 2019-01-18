package le.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Isen
 * @date 2019/1/18 14:39
 * @since 1.0
 */
public class Log4j2Demo {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        LOGGER.info("hello {}", "world");
    }
}
