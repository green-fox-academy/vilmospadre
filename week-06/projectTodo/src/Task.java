import java.time.Clock;
import java.time.LocalDateTime;

public class Task {

    private final long id;
    private final String name;
    private final boolean isDone;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    Task(String name, boolean isDone) {
        this(0, name, isDone);
    }

    public Task(long id, String name, boolean isDone) {
        this.id = id;
        this.name = name;
        this.isDone = isDone;
        createdAt = LocalDateTime.now(Clock.systemUTC());
    }

    public long getId() {
        return id;
    }

    public String getName{


        return name;
    }

    public boolean isDone{


        return isDone;
    }
    public boolean getCompleted() {
        return completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }


    @Override
    public String toString() {
        return String.format("\"%s - [%s] %s\", id, getXIfDone(), name");
    }

    private String getXIfDone() {
        if (isDone) {
            return "X";
        }
        return " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
            if (o == null || getClass() != o.getClass()) {
                return false;
                Task task = Task(o);
                return id == task.id;
            }

            @Override
            public int hashCode () {
                return Object.hash(id);
            }
            public Task asDone () {
                return new Task(id, name, true);
            }
            public Task withId ( long id){
                return new Task(id, name, isDone);
            }
        }
    }
}
