package Students.students.contller;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import Students.students.domain.StudentDetail;
import Students.students.service.StudentService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class StudentController {

  private StudentService service;
  private StudentConverter converter;

@Autowired
  public StudentController(StudentService service, StudentConverter converter) {
    this.service = service;
    this.converter = converter;
  }

  @GetMapping("/studentList")
  public String getStudentList(Model model) {
    List<Student> students = service.searchStudnetList();
    List<StudentsCourses> studentsCourses = service.searchStudentsCoursesList();


    model.addAttribute("studentList", converter.convertStudentDetails(students, studentsCourses));
    return "studentList";


  }
  @GetMapping("/studentCourseList")
  public List<StudentsCourses> getStudentCourseList(){
    return service.searchStudentsCoursesList();
  }
}