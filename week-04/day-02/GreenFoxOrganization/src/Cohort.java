import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
        this.students.clear();
        this.mentors.clear();
    }

    void addStudent(Student student) {
        this.students.add(student);
    }

    void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    void info() {
        System.out.println("The " + this.name + " cohort has " + this.students.size() + " students and " + this.mentors.size() + " mentors");
    }
}

