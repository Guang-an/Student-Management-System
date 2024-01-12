import java.util.Arrays;

class Student {
    private String name;
    private String[] courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", courses=" + Arrays.toString(courses) + '}';
    }
}