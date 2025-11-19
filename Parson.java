package homeworkes;

public class Parson {

    String name;
    int age;

    public Parson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void talk() {
        System.out.println(name + " is talking.");
    }

    public String getAgeCategory() {
        if (age >= 1 && age <= 12) {
            return "children";
        } else if (age >= 13 && age <= 17) {
            return "teenagers";
        } else if (age >= 18) {
            return "adults";
        } else {
            return "invalid age";
        }
    }
}

