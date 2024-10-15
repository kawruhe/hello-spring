package com.ghost.hello;

public class HelloResponse {
    private String message;
    private String envSource; // replace with actual variable name
    private String version; // replace with actual variable name

    public HelloResponse(String message, String envSource, String version) {
        this.message = message;
        this.envSource = envSource;
        this.version = version;
    }

    public String getMessage() {
        return message;
    }

    public String getEnvSource() {
        return envSource;
    }

    public String getVersion() {
        return version;
    }
}
