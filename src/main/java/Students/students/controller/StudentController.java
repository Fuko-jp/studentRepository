package Students.students.controller;

import Students.students.controller.handler.exceptionHandler;
import Students.students.domain.StudentDetail;
import Students.students.exception.TestException;
import Students.students.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import java.util.List;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 受講生の検索や登録、更新などを行うREST　APIとして実行されるControllerです。
 */
@Validated
@RestController

public class StudentController {

  /** 受講生サービス*/
  private StudentService service;


  @Autowired
  public StudentController(StudentService service) {
    this.service = service;
  }

  /**
   *受講生詳細の一覧検索です。
   * 全件検索を行うので、条件指定は行いません。
   * @return　受講生一覧（全件）
   */
  @Operation(summary = "一覧検索", description = "受講生の一覧を検索します。")
  @GetMapping("/studentList")
  public List<StudentDetail> getStudentList() {
   return service.searchStudentList();
  }
  /**
   * 受講生詳細の検索です。
   * IDに紐づく任意の受講生の情報を取得します。
   * @param id　受講生ID
   * @return 受講生
   */
  @Operation(summary = "受講生検索", description = "受講生情報を検索します。")
  @GetMapping("/student/{id}")
  public StudentDetail getStudent(
      @PathVariable @NotBlank @Pattern(regexp = "^\\d+$") @Size(min = 1, max = 3) String id) {
    return service.searchStudent(id);
  }

  /**
   * 受講生詳細の登録を行います。
   * @param studentDetail　受講生詳細
   * @return　実行結果
   */
 @Operation(summary = "受講生登録", description = "受講生を登録します。", responses = {
     @ApiResponse(responseCode = "400", content = {@Content()})
 })
  @PostMapping("/registerStudent")
  public ResponseEntity<StudentDetail> registerStudent(@RequestBody @Valid StudentDetail studentDetail) {
    StudentDetail responseStudentDetail = service.registerStudent(studentDetail);
    return ResponseEntity.ok(responseStudentDetail);
  }

  /**
   * 受講生詳細の更新を行います。
   * キャンセルフラグの更新もここで行います（論理削除）。
   * @param studentDetail　受講生詳細
   * @return　実行結果
   */
  @Operation(summary = "受講生更新", description = "受講生情報を更新します。")
  @PutMapping("/updateStudent")
  public ResponseEntity<String> updateStudent(@RequestBody StudentDetail studentDetail) {
    service.updateStudent(studentDetail);
    return ResponseEntity.ok("更新処理が成功しました。");
  }

  @ExceptionHandler(TestException.class)
  public ResponseEntity<String> handleTestException(TestException ex){
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
  }
  @ExceptionHandler(exceptionHandler.class)
  public ResponseEntity<String> handleExceptionHandler(exceptionHandler ex){
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("エラーが発生しました");
  }
}
