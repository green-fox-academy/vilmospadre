public class Teachers {

    String name;

    Teachers(String name) {
        this.name = name;
    }

    void teach(Student i) {
        System.out.println(this.name + "answers" + i.name);
        i.learn(this);
    }
void answer(Student v) {
    System.out.println(this.name + "says" + v.name  );
}
}
