package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public class StudentDetail {

  private Student student;

  private List<StudentsCourses> studentsCoursesList;

  }

