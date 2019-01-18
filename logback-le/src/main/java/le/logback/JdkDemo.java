package le.logback;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


import java.util.logging.Logger;

/**
 * @author Isen
 * @date 2019/1/18 19:15
 * @since 1.0
 */
public class JdkDemo {
    // PROBLEM isen  为毛不行
//    private static final Logger LOGGER = LoggerFactory.getLogger(JdkDemo.class);
    private static final Logger LOGGER = Logger.getLogger(JdkDemo.class.getName());

    public static void main(String[] args) {
//        LOGGER.info("hello {}", "world");
        LOGGER.info("hello world");
    }
}
