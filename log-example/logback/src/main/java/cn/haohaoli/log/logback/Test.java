package cn.haohaoli.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LiWenHao
 */
public class Test {

    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("info");
    }
}
