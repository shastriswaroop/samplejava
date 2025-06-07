package shastri.swaroop.java_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteAPI {
    public static void main(String []args) throws IOException {
        Path path = Paths.get("./resources/sample.txt");
        String fileContent= Files.readString(path);
        System.out.println(fileContent);

        String newfileContent= fileContent.replace("line", "Lines");
        Path newFilePath = Paths.get("./resources/sample-1.txt");

        Files.writeString(newFilePath, newfileContent);
    }
}
