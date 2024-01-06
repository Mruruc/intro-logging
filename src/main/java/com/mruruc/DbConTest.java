package com.mruruc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DbConTest {
    private static final Logger log= LogManager.getLogger(DbConTest.class);

    public static void getConnection(){
        log.trace("Test For Trace!");
        log.debug("Test For Debug");
        log.info("Test For Info");
        log.warn("Test For Warn");
        log.error("Test For Error");
        log.fatal("Test For Fatal");
    }
}
