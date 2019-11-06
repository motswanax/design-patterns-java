package com.svs.creational.dependencyInversionAndInjection;

public interface Service {
    void write(String message);
}

class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service myService;

    // injects via the constructor
    private Client(Service myService) {
        this.myService = myService;
    }

    private void doSomething() {
        myService.write("This is a message");
    }

    private void setService(Service service) {
        this.myService = service;
    }

    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // injects via the constructor
        client.doSomething();

        client.setService(service); // injects via the setter
    }
}
