package Students.students.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

  public Student() {

  }

  private String id;
  private String name;
  private String kanaName;
  private String nickname;
  private String email;
  private String region;
  private int age;
  private String sex;
  private String remark;
  private int isDeleted;

  public Student(String id, String name, String kana_name, String nickname, String email,
      String region, int age, String sex, String remark, int isDeleted) {
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getKanaName() {
    return kanaName;
  }

  public void setKanaName(String kanaName) {
    this.kanaName = kanaName;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public int getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(int isDeleted) {
    this.isDeleted = isDeleted;
  }
}