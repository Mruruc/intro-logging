package com.mruruc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ControllerTest {
    private static final Logger log= LogManager.getLogger(ControllerTest.class);


    public void getUsers(Integer id){
        if(id == null){
            log.trace("ID IS NULL!");
            return;
        }
        log.debug("Data Send To DB");
        log.info("Successful");

    }
}
