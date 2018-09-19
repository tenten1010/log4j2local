package log4j2.local;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import java.util.UUID;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        int i = 0;
        ThreadContext.put("appId", "110");
        ThreadContext.put("id", UUID.randomUUID().toString().replace("-", "").toLowerCase());
        logger.error("エラーメッセージです");
    }
}
