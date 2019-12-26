package cn.haohaoli.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author LiWenHao
 */
public class Test {

    private static Logger logger = LogManager.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("info");
    }
}
