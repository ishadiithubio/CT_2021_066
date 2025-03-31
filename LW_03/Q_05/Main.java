package Q_05;

class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Kesavan Selvarajah");
        lecturer.setCourseTeaching("CTEC22043");

        Course course = new Course();
        course.setCourseName("Object-Oriented Programming");
        course.setCourseCode("CTEC22043");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Lathinka R.W.I");
        student.setDegreeName("BSc in ICT");
        student.setCourseFollowing(course.getCourseName());

        System.out.println("Course: " + course.getCourseName() + " (" + course.getCourseCode() + ")");
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Student: " + student.getStudentName() + " - " + student.getDegreeName());
        System.out.println("Following: " + student.getCourseFollowing());
    }
}
