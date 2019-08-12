package com.mercadolibre.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.jetty.http.HttpStatus;
import spark.Request;
import spark.Response;

public class PingController {

    private static final Logger logger = LogManager.getLogger(PingController.class);

    public static Object ping(Request request, Response response)
    {
        logger.info("Processing Ping...");

        response.status(HttpStatus.OK_200);

        return "Spark Pong!";
    }

}
