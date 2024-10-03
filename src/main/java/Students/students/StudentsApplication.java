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



	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}
}
