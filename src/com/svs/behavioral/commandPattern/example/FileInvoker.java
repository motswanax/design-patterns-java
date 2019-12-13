package com.svs.behavioral.commandPattern.example;

class FileInvoker {
    private Command command;

    FileInvoker(Command command) {
        this.command = command;
    }

    void execute() {
        command.execute();
    }
}
