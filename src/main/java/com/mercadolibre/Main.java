package com.mercadolibre;

import com.mercadolibre.controller.PingController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import spark.Spark;

import static spark.Spark.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);


    private static PingController pingController;


    static void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        pingController = context.getBean(PingController.class);
    }

    public static void main(String[] args) {

        init();

        port(8080);

        get("/ping", (req, res) ->
        {
            return pingController.ping();
        });

        logger.info("Listening port 8080");

    }
}