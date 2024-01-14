class Grade {
    double score;
    String courseTitle;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    
    public String toString() {
        return "Grade{" + "score=" + score + ", courseTitle='" + courseTitle + '\'' + '}';
    }
}