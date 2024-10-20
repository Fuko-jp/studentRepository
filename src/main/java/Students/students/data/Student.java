package Students.students.data;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "受講生")
@Getter
@Setter
public class Student {

  public Student() {

  }

  @Getter
  @NotBlank
  @Pattern(regexp = "^\\d+$")
  private String id;

  @NotBlank
  @Getter
  private String name;

  @NotBlank
  @Getter
  private String kanaName;

  @NotBlank
  @Getter
  private String nickname;

  @NotBlank
  @Getter
  @Email
  private String email;

  @NotBlank
  @Getter
  private String region;

  @Getter
  private int age;

  @NotBlank
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