package javaapplication4;
public class Student {
    //added first comment
    //added comment for fetchmerge
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        //added another fetch merge
        //trying the unsafe way
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
}
