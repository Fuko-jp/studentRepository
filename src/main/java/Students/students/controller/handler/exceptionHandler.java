package Students.students.controller.handler;

public class exceptionHandler extends RuntimeException {

  public exceptionHandler() {
    super();
  }

  public exceptionHandler(String message, Throwable cause) {
    super(message, cause);
  }

  public exceptionHandler(Throwable cause) {
    super(cause);
  }

  protected exceptionHandler(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public exceptionHandler(String message) {
    super(message);
  }
}
