package com.svs.dependencyInversionAndInjection;

/**
 * Example of no dependency injection
 * @author baike
 */
public class ClientClass {
    // Internal reference to the service used by this client
    private ExampleService service;

    ClientClass() {
        // specify a specific implementation in the constructor instead of usind dependencies
        service = new ExampleService();
    }

    // method within this client that uses the services
    public String greet() {
        return "Hello " + service.getName();
    }
}

class ExampleService {
    String getName() {
        return "";
    }
}
