package com.svs.behavioral.memento.example;

/**
 * This is the originator class
 *
 * @author baike
 */
class FileWriterUtil {

    private String filename;
    private StringBuilder content;

    FileWriterUtil(String filename) {
        this.filename = filename;
        this.content = new StringBuilder();
    }

    void write(String str) {
        content.append(str);
    }

    /**
     * Creates the memento
     * @return new memento
     */
    Memento save() {
        return new Memento(this.filename, this.content);
    }

    /**
     * Restores to previous state
     * @param obj the originator
     */
    void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    /**
     * This keeps the state
     */
    private class Memento {
        private String filename;
        private StringBuilder content;

        Memento(String filename, StringBuilder content) {
            /* note the deep copy so that Memento and FileWriterUtil content variables don't refer to the same object*/
            this.filename = filename;
            this.content = new StringBuilder(content);
        }
    } // end of inner class
}
