package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourse;
import jakarta.validation.Valid;
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
  @Valid
  private Student student;
  @Valid
  private List<StudentsCourse> studentCourseList;

  }

