public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    Student() {
    super();
    this.previousOrganization = "The school of Life.";
    }

    Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

        @Override
    public void getGoal() {
            System.out.println("My goal is to be a junior software developer.");
        }

        @Override
    public void introduce() {
            super.introduce();
            System.out.println("Hi, I'm " + getName() + "a " + getAge() + " years old " + getGender() + " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days from the course already.");
        }

        public void skippedDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
        }
    }
