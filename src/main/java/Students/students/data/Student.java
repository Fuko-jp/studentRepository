package Students.students.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

  public Student() {

  }

  @Getter
  private String id;
  @Getter
  private String name;
  @Getter
  private String kanaName;
  @Getter
  private String nickname;
  @Getter
  private String email;
  @Getter
  private String region;
  @Getter
  private int age;
  @Getter
  private String sex;
  @Getter
  private String remark;
  public boolean isDeleted;

  public Student(String id, String name, String kana_name, String nickname, String email,
      String region, int age, String sex, String remark, boolean isDeleted) {
    this.id = id;
    this.name = name;
    this.kanaName = kana_name;
    this.nickname = nickname;
    this.email = email;
    this.region = region;
    this.age = age;
    this.sex = sex;
    this.remark = remark;
    this.isDeleted = isDeleted;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setKanaName(String kanaName) {
    this.kanaName = kanaName;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
  public boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(boolean isDeleted) {
    this.isDeleted = isDeleted;
  }
}