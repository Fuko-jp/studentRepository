package Students.students;

import Students.students.data.Student;
import Students.students.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class StudentsApplication {

//	@Autowired
//	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}
}
//@PostMapping("/students")
//public void registerStudent(@RequestBody Student student) {
//	repository.registerStudent(student);
//
//}
//
//@PatchMapping("/students/{id}")
//public void updateStudentAge(@PathVariable int id, @RequestParam int age){
//	repository.updateStudentAge(id, age);
//}
//
//@DeleteMapping("/students/{id}")
//public void deleteStudent(@PathVariable int id){
//	repository.deleteStudent(id);
//	}
