package Students.students.repository;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
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

// @Insert("INSERT INTO students (name, nickname, eAddress, region, age, sex) VALUES (#{name}, #{nickname}, #{eAddress}, #{region}, #{age}, #{sex})")
// void registerStudent(Student student);
//
// @Update("UPDATE students SET age = #{age} WHERE id = #{id}")
// void updateStudentAge(@Param("id") int id, @Param("age") int age);
//
// @Delete("DELETE FROM students WHERE id = #{id}")
// void deleteStudent(@Param("id") int id);
//
}
