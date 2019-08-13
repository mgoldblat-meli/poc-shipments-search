package com.mercadolibre.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.http.HttpStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import spark.Request;
import spark.Response;

@Service
public class PingController {

    private static final Logger logger = LogManager.getLogger(PingController.class);

    public String ping()
    {
        logger.info("Processing Ping...");

        return "Spark Pong!";
    }

}
