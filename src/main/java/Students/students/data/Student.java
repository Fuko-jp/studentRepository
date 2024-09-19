package Students.students.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
  public Student(){

  }
  private String id;
  private String name;
  private String kanaName;
  private String nickname;
  private String email;
  private String region;
  private int age;
  private String sex;



  public Student(String id, String name, String kanaName, String nickname, String email, String region, int age, String sex) {
    this.id = id;
    this.name = name;
    this.kanaName = kanaName;
    this.nickname = nickname;
    this.email = email;
    this.region = region;
    this.age = age;
    this.sex = sex;

  }


  }


