package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class StudentDetail {

  private Student student;

  private List<StudentsCourse> studentCourseList;

  }

