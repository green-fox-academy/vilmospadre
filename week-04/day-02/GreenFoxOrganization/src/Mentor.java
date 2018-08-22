import java.util.Arrays;
public class Mentor extends Person {

    private String level;

    Mentor(String name, int age, String gender, String level) {
       super(name, age, gender);
       this.level= level;
    }

    Mentor() {
        super();
        this.level = "intermediate";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is to educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() + " " + this.level + " mentor.");
    }
}
