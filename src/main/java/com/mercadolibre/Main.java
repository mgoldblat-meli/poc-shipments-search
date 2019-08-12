package com.mercadolibre;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.mercadolibre.controller.PingController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spark.Spark;

import static spark.Spark.*;

public class Main {

    //private static final Logger logger = LogManager.getLogger(Main.class);

    private final PingController pingController;

    @Inject
    Main(PingController pingController)
    {
        this.pingController = pingController;
    }

    void run(int port)
    {
        port(port);

        get("/search", (req, res) ->{
            return this.pingController.search(req, res);
        });
    }

    public static void main(String[] args) {

        Guice.createInjector(new GuiceModule())
                .getInstance(Main.class)
                .run(8080);

        //logger.info("Listening port 8080");
    }
}