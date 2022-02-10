package ua.hille.lesson8;

public enum Status {
  NEW("New"),
  IN_PROGRESS("In Progress"),
  DONE("Done"),
  IN_REVIEW("In review");

  private String status;

  Status(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
