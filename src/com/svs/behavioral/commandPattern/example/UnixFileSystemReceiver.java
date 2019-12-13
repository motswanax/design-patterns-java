package com.svs.behavioral.commandPattern.example;

/**
 * Concrete receiver
 *
 * @author baike
 */
class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void openFile() {
        System.out.println("Opening file in Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix OS");
    }
}
