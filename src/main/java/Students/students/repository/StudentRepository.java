package Students.students.repository;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全件検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */

 @Mapper
  @Repository
 public interface StudentRepository {

// /**
//  * 全件検索します。
//  * @return　全件検索した受講生情報の一覧
//  */

 @Select("SELECT * FROM students")
 List<Student> search();

 @Select("SELECT * FROM student_courses")
  List<StudentsCourses> sesrchStudentsCourses();


 @Insert("INSERT INTO students(name, kana_name, nickname, email, region, age, sex, remark, isDeleted)"
     + "VALUES(#{name}, #{kanaName}, #{nickname}, #{email}, #{region}, #{age}, #{sex}, #{remark}, false)")

 @Options(useGeneratedKeys = true, keyProperty = "id")
 void registerStudent(Student student);

 @Insert("INSERT INTO student_courses(studentId, course, courseStartAt, courseEndAt)"
     +"VALUES(#{studentId}, #{course}, #{courseStartAt}, #{courseEndAt})")
 @Options(useGeneratedKeys = true, keyProperty = "id")
 void registerStudentsCourses(StudentsCourses studentsCourses);

 @Select("SELECT * FROM students WHERE id = #{id}")
 Student findStudentById(String id);

 @Select("SELECT * FROM student_courses WHERE studentId = #{studentId}")
 List<StudentsCourses> findCoursesByStudentId(String studentId);

}
