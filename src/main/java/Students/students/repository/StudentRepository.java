package Students.students.repository;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//import java.util.Optional;
//import org.xmlunit.util.Mapper;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全件検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */

 @Mapper
  @Repository
 public interface StudentRepository {

 /**
  * 全件検索します。
  * @return　全件検索した受講生情報の一覧
  */

 @Select("SELECT * FROM students")
 List<Student> search();

 @Select("SELECT * FROM student_courses")
  List<StudentsCourses> sesrchStudentsCourses();

 @Insert("INSERT INTO students(name, kana_name, nickname, email, region, age, sex, remark) VALUES{#name}, #{kanaName}, #{nickname}, #{email}, #{region}, #{age}, #{sex}, #{remark}, false" )
 @Options(useGeneratedKeys = true, keyProperty = "id")
 void registerStudent(Student student);


}
