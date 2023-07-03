package j2se.io;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\mca\\io\\pre12.sql";
        File file = new File(path);
        System.out.println(file.canWrite());
        FileWriter fileWriter = new FileWriter(path);
    }
}
