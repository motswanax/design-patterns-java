package com.svs.behavioral.commandPattern.example;

public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called someState
        this.fileSystemReceiver.openFile();
    }

    // store previous state for undo, String someState
}
