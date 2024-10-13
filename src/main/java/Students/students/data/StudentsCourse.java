package Students.students.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentsCourse {

  private String id;
  private String studentId;
  private String course;
  private LocalDateTime courseStartAt;
  private LocalDateTime courseEndAt;

  public StudentsCourse() {
    this.id = id;
    this.studentId = studentId;
    this.course = course;
    this.courseStartAt = courseStartAt;
    this.courseEndAt = courseEndAt;
  }



  }

