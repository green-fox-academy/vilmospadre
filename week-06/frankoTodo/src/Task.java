import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;


    @Override
    public String toString() {
        return this.id + " - " + this.name + " created at: " + this.createdAt;
    }

    public Task(int id, String name, LocalDateTime createdAt, LocalDateTime completedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.completedAt = completedAt;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }
}
