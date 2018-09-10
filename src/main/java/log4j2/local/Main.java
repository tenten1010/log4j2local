package log4j2.local;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static Logger logger = LogManager.getLogger("test");

    public static void main(String[] args) {
//        logger.info("info");
        logger.error("error");
    }
}
