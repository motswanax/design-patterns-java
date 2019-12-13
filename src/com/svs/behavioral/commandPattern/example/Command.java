package com.svs.behavioral.commandPattern.example;

/**
 * The command
 */
interface Command {
    void execute();

    // could add undo ro redo commands
}
