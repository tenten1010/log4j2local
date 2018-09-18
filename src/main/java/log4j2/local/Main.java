package log4j2.local;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;


public class Main {
    private static Logger logger = LogManager.getLogger("test");

    public static void main(String[] args) {
        int i = 0;
        ThreadContext.put("appId", "110");
        logger.error("%d: エラーメッセージです", i);
    }
}
