package com.svs.behavioral.commandPattern.example;

class WriteFileCommand implements Command{

    private FileSystemReceiver fileSystemReceiver;

    WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
