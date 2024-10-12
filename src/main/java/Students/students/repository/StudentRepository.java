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
 * 受講生テーブルと受講生コース情報テーブルと紐づくRepositoryです。
 */
 @Mapper
  @Repository
 public interface StudentRepository {

 /**
  * 受講生の全件検索を行います。
  * @return　受講生一覧（全件）
  */
 @Select("SELECT * FROM students WHERE isDeleted = false")
  List<Student> search();

 /**
  * 受講生の検索を行います。
  *
  * @param id　受講生ID
  * @return　受講生
  */
 @Select("SELECT * FROM students WHERE id = #{id}")
 Student searchStudent(String id);

 /**
  * 受講生のコース情報の全件検索を行います。
  * @return　受講生のコース情報（全件）
  */
 @Select("SELECT * FROM student_courses")
 List<StudentsCourses> searchStudentsCoursesList();

 /**
  * 受講生IDに紐づく受講生コース情報を検索します。
  * @param studentId　受講生ID
  * @return　受講生IDに紐づく受講生コース情報
  */
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

 //受講生更新
 @Update("UPDATE students SET name = #{name}, kana_name = #{kanaName}, nickname = #{nickname}, "
     + "email = #{email}, region = #{region}, age = #{age}, sex = #{sex}, remark = #{remark}, isDeleted = #{isDeleted} WHERE id = #{id}")

 void updateStudent(Student student);

 @Update("UPDATE student_courses SET course = #{course} WHERE id = #{id}")

 void updateStudentsCourses(StudentsCourses studentsCourses);

}
