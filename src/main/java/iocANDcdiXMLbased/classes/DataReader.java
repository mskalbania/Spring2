package iocANDcdiXMLbased.classes;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private List<String> data;

    public void aggregateData() {
        data = new ArrayList<>();

        try {
            Path path = Paths.get(ClassLoader.getSystemResource("coachContext.xml").toURI());
            data = Files.readAllLines(path);
        } catch (Exception e) {
            System.out.println("Error while reading file: \n");
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        try {
            Files.delete(Paths.get(ClassLoader.getSystemResource("coachContext.xml").toURI()));
            System.out.println("File successfully deleted");
        } catch (Exception e) {
            System.out.println("Error while deleting file: \n");
            e.printStackTrace();
        }
    }

    public List<String> getData() {
        return this.data;
    }
}
