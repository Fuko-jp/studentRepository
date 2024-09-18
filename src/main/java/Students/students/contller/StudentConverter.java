package Students.students.contller;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import Students.students.domain.StudentDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter {

  public List<StudentDetail> convertStudentDetails(List<Student> students,
      List<StudentsCourses> studentsCourses){
      List<StudentDetail> studentDetails = new ArrayList<>();
  students.forEach(student -> {
        StudentDetail studentDetail = new StudentDetail();
        studentDetail.setStudent(student);


    List<StudentsCourses> convertStudentCourses = studentsCourses.stream()
        .filter(studentCourse -> student.getId().equals(studentCourse.getStudentId()))
        .collect(Collectors.toList());
    studentDetail.setStudentsCoursesList(convertStudentCourses);
    studentDetails.add(studentDetail);
  });
    return studentDetails;
}}
