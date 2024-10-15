package com.ghost.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment env;

    @GetMapping("/")
    public HelloResponse hello() {
        // Fetch environment variables
        String envSource = env.getProperty("ENV_SOURCE", "code"); // replace MY_ENV_VAR_1 with your actual env variable name
        String version = env.getProperty("VERSION", "code"); // replace MY_ENV_VAR_2 with your actual env variable name

        // Create response object
        return new HelloResponse("Hello, World!", envSource, version);
    }
}
