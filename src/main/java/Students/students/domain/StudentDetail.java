package students.students.domain;


import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import students.students.data.Student;
import students.students.data.StudentsCourses;

@Setter
@Getter

public class StudentDetail {

  private Student student;

  private List<StudentsCourses> studentsCourses;

  }

