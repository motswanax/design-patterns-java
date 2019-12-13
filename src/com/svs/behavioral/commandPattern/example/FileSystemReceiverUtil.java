package com.svs.behavioral.commandPattern.example;

/**
 * Utility class that determines OS file system
 *
 * @author baike
 */
class FileSystemReceiverUtil {
    static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is: " + osName);
        if (osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else {
            return new UnixFileSystemReceiver();
        }
    }
}
