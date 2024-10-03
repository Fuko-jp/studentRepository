package Students.students.service;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import Students.students.domain.StudentDetail;
import Students.students.repository.StudentRepository;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

  private StudentRepository repository;


  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    return repository.search();
  }

  public StudentDetail searchStudent(String id){
   Student student = repository.searchStudent(id);
   List<StudentsCourses> studentsCourses = repository.searchStudentsCourse(student.getId());
   StudentDetail studentDetail = new StudentDetail();
   studentDetail.setStudent(student);
   studentDetail.setStudentsCourses(studentsCourses);
   return studentDetail;
  }

  public List<StudentsCourses> searchStudentsCoursesList() {
    return repository.searchStudentsCoursesList();
  }

//    //TODOコース情報登録

  @Transactional
  public void registerStudent(StudentDetail studentDetail) {
    // studentDetail から student を取得して保存する
    repository.registerStudent(studentDetail.getStudent());
    for (StudentsCourses studentsCourses : studentDetail.getStudentsCourses()) {
      studentsCourses.setStudentId(studentDetail.getStudent().getId());
      studentsCourses.setCourseStartAt(LocalDateTime.now());
      studentsCourses.setCourseEndAt(LocalDateTime.now().plusYears(1));
      repository.registerStudentsCourses(studentsCourses);
    }
  }
  @Transactional
  public void updateStudent(StudentDetail studentDetail) {
    repository.updateStudent(studentDetail.getStudent());
    for (StudentsCourses studentsCourses : studentDetail.getStudentsCourses()) {
      repository.updateStudentsCourses(studentsCourses);
    }

  }

//  public Student findStudentById(String studentId) {
//    return repository.findStudentById(studentId);
//  }
//
//  public List<StudentsCourses> findCoursesByStudentId(String studentId) {
//    return repository.findCoursesByStudentId(studentId);

//  }

}