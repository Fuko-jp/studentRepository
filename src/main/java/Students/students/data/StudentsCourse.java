package Students.students.data;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "受講生コース情報")
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

