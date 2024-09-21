package Students.students.service;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import Students.students.domain.StudentDetail;
import Students.students.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
  private StudentRepository repository;


  @Autowired
  public StudentService(StudentRepository repository){
    this.repository = repository;
  }
  public List<Student> searchStudnetList(){
    //検索処理
    repository.search();


    return repository.search();
  }
  public List<StudentsCourses> searchStudentsCoursesList(){
    return repository.sesrchStudentsCourses();
  }
  @Transactional
  public void registerStudent(StudentDetail studentDetail){
    repository.registerStudent(studentDetail.getStudent());
  }
}
