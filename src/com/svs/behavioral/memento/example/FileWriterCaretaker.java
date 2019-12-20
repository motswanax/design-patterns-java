package com.svs.behavioral.memento.example;

/**
 * Controls access to the originator
 *
 * @author baike
 */
class FileWriterCaretaker {

    private Object obj;

    void save(FileWriterUtil fileWriter) {
        this.obj = fileWriter.save();
    }

    void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(obj);
    }
}
