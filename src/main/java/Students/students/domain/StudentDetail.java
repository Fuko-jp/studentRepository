package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentDetail {
  private Student student;

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public void setStudentsCoursesList(
      List<StudentsCourses> studentsCoursesList) {
    this.studentsCoursesList = studentsCoursesList;
  }

  private List<StudentsCourses> studentsCoursesList;

  }

