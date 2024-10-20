package Students.students.domain;

import Students.students.data.Student;
import Students.students.data.StudentsCourse;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;

@Schema(description = "受講生詳細")
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

