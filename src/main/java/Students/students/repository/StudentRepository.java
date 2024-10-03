package Students.students.repository;

import Students.students.data.Student;
import Students.students.data.StudentsCourses;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * 受講生情報を扱うリポジトリ
 *
 * 全件検索や単一条件での検索、コース情報の検索が行えるクラスです。
 */

 @Mapper
  @Repository
 public interface StudentRepository {
  @Select("SELECT * FROM students")
  List<Student> search();

 @Select("SELECT * FROM students WHERE id = #{id}")
 Student searchStudent(String id);

 @Select("SELECT * FROM student_courses")
 List<StudentsCourses> searchStudentsCoursesList();

 @Select("SELECT * FROM student_courses WHERE studentId = #{studentId}")
 List<StudentsCourses> searchStudentsCourse(String studentId);

//受講生登録
 @Insert("INSERT INTO students(name, kana_name, nickname, email, region, age, sex, remark, isDeleted)"
     + "VALUES(#{name}, #{kanaName}, #{nickname}, #{email}, #{region}, #{age}, #{sex}, #{remark}, false)")

 @Options(useGeneratedKeys = true, keyProperty = "id")
 void registerStudent(Student student);

 @Insert("INSERT INTO student_courses(studentId, course, courseStartAt, courseEndAt)"
     +"VALUES(#{studentId}, #{course}, #{courseStartAt}, #{courseEndAt})")
 @Options(useGeneratedKeys = true, keyProperty = "id")
 void registerStudentsCourses(StudentsCourses studentsCourses);

 //Idから受講生情報を取得
// @Select("SELECT * FROM students WHERE id = #{id}")
// Student findStudentById(String id);
//
// @Select("SELECT * FROM student_courses WHERE studentId = #{studentId}")
// List<StudentsCourses> findCoursesByStudentId(String studentId);

 //受講生更新
 @Update("UPDATE students SET name = #{name}, kana_name = #{kanaName}, nickname = #{nickname}, "
     + "email = #{email}, region = #{region}, age = #{age}, sex = #{sex}, remark = #{remark}, isDeleted = #{isDeleted} WHERE id = #{id}")

 void updateStudent(Student student);

 @Update("UPDATE student_courses SET course = #{course} WHERE id = #{id}")

 void updateStudentsCourses(StudentsCourses studentsCourses);


}
