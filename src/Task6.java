import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class Task6 {

    public Path newFile() throws IOException {

        System.out.println("Podaj tekst.");
        Scanner scanner = new Scanner(System.in);
        String newLine = scanner.nextLine();


        Path path = Paths.get(System.getProperty("user.home"), "Desktop", "nowy");
        //Files.createFile(path);
//        List<String> strings = Files.readAllLines(path);
        List<String> strings = new ArrayList<>();
        strings.add(newLine);
        Files.write(path, strings,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        return path;

    }

    public void printFile(Path path){

        try {
            List<String> strings = Files.readAllLines(path);
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
