
public class TodoApp {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();

        if (args[0].equals("-l")) {
            taskService.findAll().forEach(System.out::println);
        }
    }
}
