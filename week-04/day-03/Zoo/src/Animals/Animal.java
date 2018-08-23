package Animals;

public abstract class Animal {

    private String name;
    public String getName() {
        return name;
    }
        private int age;
        public int getAge () {
            return age;
        }

        private String eaten;
        public String getEaten () {
            return eaten;
        }

    public abstract String breed();

    Animal(String name) {
        this.setName(name);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEaten(String eaten) {
        this.eaten = eaten;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

