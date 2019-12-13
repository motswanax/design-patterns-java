package com.svs.behavioral.commandPattern.example;

public class Client {
    public static void main(String[] args) {
        // create the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        // create the command and associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        // create the invoker and associate it with the command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        // perform action on invoker object
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();
    }
}
