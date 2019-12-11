package com.svs.structural.proxyExample;

/**
 * This is the proxy.
 *
 * @author baike
 */
class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
