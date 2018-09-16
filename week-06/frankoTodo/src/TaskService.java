import java.util.List;

public class TaskService {

    TaskPersistor persistor = new TaskPersistor();

    List<Task> findAll() {
        return persistor.readTasks();
    }

}
