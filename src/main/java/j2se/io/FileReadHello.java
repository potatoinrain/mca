package j2se.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileReadHello {

    static String path = "C:\\data\\appbak\\2.txt";

    public static void streamRead() {
        File file = new File(path);
        try {
            InputStream stream = new FileInputStream(path);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
