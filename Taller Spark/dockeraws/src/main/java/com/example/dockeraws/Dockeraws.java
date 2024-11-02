package com.example.dockeraws;

import static spark.Spark.*;

public class Dockeraws {

    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello World!");
    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
