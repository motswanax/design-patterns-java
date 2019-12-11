package com.svs.structural.proxyExample;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("someImage.jpg");

        // image will be loaded from disk
        image.display();
        System.out.println();

        image.display();
    }
}
