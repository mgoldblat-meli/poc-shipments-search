package com.mercadolibre;

import com.mercadolibre.controller.PingController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Spark;

import static spark.Spark.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        port(8080);

        get("/ping", PingController::ping);

        logger.info("Listening port 8080");

    }
}