package ua.hille.lesson14;

import java.util.Objects;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class User implements Comparable<User> {
  private String name;
  private String role;
  private Integer age;
  private String[] course;

  public User(String name) {
    this.name = name;
    this.role = "user";
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    User user = (User) o;
    return Objects.equals(name, user.name) && Objects.equals(role, user.role);
  }

  @Override public int hashCode() {
    return Objects.hash(name, role);
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + ", role='" + role + '\'' + ", age=" + age + '}';
  }

  @Override
  public int compareTo(User o) {
    return o.name.compareTo(this.name);
  }
}
