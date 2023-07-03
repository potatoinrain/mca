package j2se.io;

import java.io.File;
import java.nio.file.Files;

public class WriteAble {

    public static String filepath = "/opt/bak/dbone.lic";

    public static void main(String[] args) {
        String directoryPath = "/opt/appbak/dtest.txt";
        boolean hasWritePermission = hasWritePermission(directoryPath);
        File file = new File(directoryPath);
        if(file.isDirectory()){
            System.out.println("isDirectory");
        } else {
            System.out.println("isFile");
        }

        System.out.println("fileExists" + fileExists(directoryPath));
        System.out.println("hasWritePermission" + hasWritePermission);

    }

    public static boolean fileExists(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.exists();
    }

    public static boolean hasWritePermission(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.canWrite();
    }

}
