package le.log4j;


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
        LOGGER.info("hello {}", "world");
    }
}
