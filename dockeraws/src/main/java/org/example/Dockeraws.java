package org.example;

import static spark.Spark.*;

public class Dockeraws {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
