package com.mercadolibre.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Request;
import spark.Response;

public class PingController {

    //private static final Logger logger = LogManager.getLogger(PingController.class);

    public String ping()
    {
        //logger.info("Processing Ping...");

       // response.status(HttpStatus.OK_200);

        return "Spark Pong!";
    }

    public String search(Request req, Response res) {
        return "Spark Pong!";
    }
}
