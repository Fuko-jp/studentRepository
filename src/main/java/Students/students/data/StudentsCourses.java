package Students.students.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentsCourses {

  private String id;

  private String studentId;
  private String courseName;
  private LocalDateTime courseStartAt;
  private LocalDateTime courseEndAt;

  public StudentsCourses(String id, String studentId, String courseName,
      LocalDateTime courseStartAt,
      LocalDateTime courseEndAt) {
    this.id = id;
    this.studentId = studentId;
    this.courseName = courseName;
    this.courseStartAt = courseStartAt;
    this.courseEndAt = courseEndAt;
  }
}
