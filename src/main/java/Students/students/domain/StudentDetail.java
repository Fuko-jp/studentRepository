package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.Collections;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class StudentDetail {

  private Student student;

  private List<StudentsCourses> studentsCourses;
//  public List<StudentsCourses> getStudentsCourses() {
//    if (studentsCourses == null) {
//      return Collections.emptyList();  // 空のリストを返す
//    }
//    return studentsCourses;
//  }

  }

