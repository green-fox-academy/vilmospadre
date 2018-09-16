import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaskPersistor {

    public List<Task> readTasks() {
        return this.readAll()
            .stream()
            .map(this::createTaskFromLine)
            .collect(Collectors.toList());
    }

    private List<String> readAll() {
        try {
            return Files.readAllLines(Paths.get("tasks.txt"));
        } catch (IOException e) {
            System.out.println("Error during file read: "  + e.getMessage());
            return Collections.emptyList();
        }
    }

    private Task createTaskFromLine(String line) {
        String[] lineItems = line.split(",");
        int id = Integer.parseInt(lineItems[0]);
        String name = lineItems[1];
        LocalDateTime createdAt = LocalDateTime.parse(lineItems[2]);
        LocalDateTime completedAt = LocalDateTime.parse(lineItems[3]);
        return new Task(id, name, createdAt, completedAt);
    }

}
