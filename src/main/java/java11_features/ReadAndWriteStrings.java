package java11_features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAndWriteStrings {

    public static void main(String[] args) throws IOException {
        Path filePath = Files.writeString(Files.createTempFile(Path.of("H:\\"), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
    }
}
