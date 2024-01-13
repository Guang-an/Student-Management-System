class Course {
    String title;
    String teacher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String toString() {
        return "Course{" + "title='" + title + '\'' + ", teacher='" + teacher + '\'' + '}';
    }
}
