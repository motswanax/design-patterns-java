package com.svs.behavioral.memento.example;

public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of data:\nMyra\nLucy");

        System.out.println(fileWriter + "\n");

        // let's save the file
        caretaker.save(fileWriter);

        // now write something else
        fileWriter.write("\nSecond set of data:\nBAD");

        // check file contents
        System.out.println(fileWriter + "\n");

        // undo to the last save
        caretaker.undo(fileWriter);

        // check file contents again
        System.out.println(fileWriter + "\n");
    }
}
