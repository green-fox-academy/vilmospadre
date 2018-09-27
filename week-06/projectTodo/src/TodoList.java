//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import javafx.concurrent.Task;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    public static final AssignedList assignedList = new AssignedList();

    private static TodoList currentList;
    private static List<TodoList> todoLists = new ArrayList<TodoList>();

    private ArrayList<Task> tasks;
    private ArrayList<User> collaborators = new ArrayList<User>();
    private String name;
    private long id;
    private static long nextLocalId = -1;

    public TodoList(ArrayList<Task> tasks, ArrayList<User> collaborators, String name, long id) {
        this.tasks = tasks;
        this.collaborators = collaborators;
        this.name = name;
        this.id = id;
    }
    public TodoList(String name, ArrayList<Task> tasks, ArrayList<User> collaborators){
        this.tasks = tasks;
        this.name = name;
        this.collaborators = collaborators;
        this.id = nextLocalId--;
    }
    public TodoList(String name, ArrayList<Task> tasks) {
        this.tasks = tasks;
        this.name = name;
        this.collaborators = new ArrayList<User>();
        this.id = nextLocalId--;
    }
    public TodoList(String name){
        this.tasks = new ArrayList<Task>();
        this.name = name;
        this.collaborators = new ArrayList<User>();
        this.id = nextLocalId--;

    }

    public static void setCurrentList(TodoList newCurrentList){

        if (!TodoList.getTodoLists().contains(newCurrentList) && newCurrentList != assignedList) {
            throw new IllegalArgumentException("List doesn't exist.");
        }
        currentList = newCurrentList;
    }
    public static TodoList getListWithId(long id) {
        for (TodoList list : todoLists){
            if (list.getId()==id){
                return list;
            }
        }
        throw new IllegalArgumentException("List net found.");
    }

}
