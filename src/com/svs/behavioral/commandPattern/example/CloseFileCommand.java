package com.svs.behavioral.commandPattern.example;

class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
