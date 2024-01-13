import java.util.Arrays;

class Student {
    String name;
    int age;
    String[] courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", courses=" + Arrays.toString(courses) + '}';
    }
}
