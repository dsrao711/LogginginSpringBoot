package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/test")
    public String hello()
    {
        logger.info("An INFO Message ");
        logger.trace("TRACE");
        logger.error("ERROR");
        logger.warn("WARNING");
        return "Hello Scaler!";
    }
}
