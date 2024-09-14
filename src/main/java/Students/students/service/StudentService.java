package Students.students.service;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import Students.students.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    //絞り込みをする。年齢が３０代の人のみを抽出する。
    //抽出したリストをコントローラーに返す。
    return repository.search();
  }
  public List<StudentsCourses> searchStudentsCoursesList(){
    //絞り込み検索で「javaコース」のコース情報のみを抽出する。
    //抽出したリストをコントローラーに返す。
    return repository.sesrchStudentsCourses();
  }

}
